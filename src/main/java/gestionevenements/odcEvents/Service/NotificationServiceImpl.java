package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Notification;
import gestionevenements.odcEvents.Reposotory.NotificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

@AllArgsConstructor
public class NotificationServiceImpl implements NotificationService{
    private NotificationRepository NR;

    @Override
    public Notification envoyerNotification(Notification notification) {
        return NR.save(notification);
    }

    @Override
    public List<Notification> recupererNotifications() {
        return NR.findAll();
    }
}
