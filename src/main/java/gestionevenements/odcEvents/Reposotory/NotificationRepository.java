package gestionevenements.odcEvents.Reposotory;

import gestionevenements.odcEvents.Model.Evenements;
import gestionevenements.odcEvents.Model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository <Notification,Long> {
}
