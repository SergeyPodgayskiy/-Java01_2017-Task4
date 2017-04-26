package com.epam.task4.service.factory;


import com.epam.task4.service.TreasureService;
import com.epam.task4.service.impl.DomTreasureService;
import com.epam.task4.service.impl.SaxTreasureService;
import com.epam.task4.service.impl.StaxTreasureService;

/**
 * @author serge
 *         19.04.2017.
 */
public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();
    private final SaxTreasureService saxTreasureService = new SaxTreasureService();
    private final StaxTreasureService staxTreasureService = new StaxTreasureService();
    private final DomTreasureService domTreasureService = new DomTreasureService();

    private ServiceFactory(){}

    public static ServiceFactory getINSTANCE() {
        return INSTANCE;
    }


    public TreasureService getConcreteService(String serviceName){
        switch (serviceName){
            case "sax":
                return saxTreasureService;
            case "stax":
                return staxTreasureService;
            case "dom":
                return domTreasureService;
            default:
                throw new IllegalArgumentException();
        }
    }
}
