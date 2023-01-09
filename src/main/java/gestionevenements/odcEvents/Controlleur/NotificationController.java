package gestionevenements.odcEvents.Controlleur;

import gestionevenements.odcEvents.Service.NotificationService;
import gestionevenements.odcEvents.Model.Notification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public Notification envoyerNotification(@RequestBody Notification notification) {
        return notificationService.envoyerNotification(notification);
    }

    @GetMapping
    public List<Notification> recupererNotifications() {
        return notificationService.recupererNotifications();
    }
}
