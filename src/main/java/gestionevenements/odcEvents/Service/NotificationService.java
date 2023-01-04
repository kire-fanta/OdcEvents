package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Notification;

import java.util.List;

public interface NotificationService {
    Notification envoyerNotification(Notification notification);
    List<Notification> recupererNotifications();
}
