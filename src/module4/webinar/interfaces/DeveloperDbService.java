package module4.webinar.interfaces;

import module4.webinar.abstractclassesandmethods.DeveloperEmployee;

public class DeveloperDbService implements DBService {
    DeveloperEmployee[] dbEmulator = new DeveloperEmployee[10];
    int index = 0;

    @Override
    public void save(DeveloperEmployee employee) {
        dbEmulator[index] = employee;
        index++;
    }

    @Override
    public DeveloperEmployee get(long id) {
        for (DeveloperEmployee developerEmployee : dbEmulator) {
            if (developerEmployee.getId() == id)
                return developerEmployee;
        }
        return null;
    }

    @Override
    public void update(DeveloperEmployee employee) {
        //
    }

    @Override
    public DeveloperEmployee[] getAllDevelopers() {
        return new DeveloperEmployee[0];
    }

   /* @Override
    public void test() {

    }*/
}
