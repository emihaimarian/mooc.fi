
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility {

    private final Map<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        this.storageFacility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {

        ArrayList<String> emptyList = new ArrayList<>();
        return this.storageFacility.getOrDefault(storageUnit, emptyList);
    }

    public void remove(String storageUnit, String item) {
        this.storageFacility.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {

        ArrayList<String> storageUnitsKeys = new ArrayList<>();

        for (String storageUnitKey : storageFacility.keySet()) {

            if (!storageFacility.get(storageUnitKey).isEmpty()) {

                storageUnitsKeys.add(storageUnitKey);
            }
        }
        return storageUnitsKeys;
    }
}
