/*
 * Copyright © 2018 Dennis Schulmeister-Zimolong
 * 
 * E-Mail: dhbw@windows3.de
 * Webseite: https://www.wpvs.de/
 * 
 * Dieser Quellcode ist lizenziert unter einer
 * Creative Commons Namensnennung 4.0 International Lizenz.
 */
package dhbwka.wwi.vertsys.javaee.jToBuy.jpa;

/**
 * Statuswerte einer Aufgabe.
 */
public enum TaskStatus {
    OPEN, /*IN_PROGRESS,*/ FINISHED,/* CANCELED, POSTPONED*/;

    /**
     * Bezeichnung ermitteln
     *
     * @return Bezeichnung
     */
    public String getLabel() {
        switch (this) {
            case OPEN:
                return "Biete";
            
            //case IN_PROGRESS:
              //  return "Biete";
            case FINISHED:
                return "Suche";
            /*case CANCELED:
                return "Abgesagt";
            case POSTPONED:
                return "Zurückgestellt";
           */ default:
                return this.toString();
        
}
        
    }
}
