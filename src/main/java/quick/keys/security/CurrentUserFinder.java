package quick.keys.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import quick.keys.entities.User;
import quick.keys.services.UserService;

@Service
public class CurrentUserFinder {

    final UserService usService;

    public CurrentUserFinder(UserService usService) {
        this.usService = usService;
    }

    public long getCurrentUserId() {
        UserDetails details = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = details.getUsername();
        long userId = -1;
        for (User user : usService.findAll()) {
            if (user.getUserName().equals(username)) {
                userId = user.getUserId();
                break;
            }
        }
        return userId;
    }

    public User getCurrentUser() {
        return usService.findById(getCurrentUserId());
    }
}
