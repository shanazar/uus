import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AmeerikaMäed {
    public boolean vanusedSobivad(Dokument[] dokumendid) {
        for (Dokument id : dokumendid) {
            if (!id.onVähemalt12Aastane())
                return false;
        }
        return true;
    }

    public List<Dokument> ebasobivadDokumendid(Dokument[] dokuments) {
        ArrayList<Dokument> väljund = new ArrayList<Dokument>();
        for (int i = 0; i < dokuments.length; i++) {
            if (!dokuments[i].onVähemalt12Aastane()) {
                väljund.add(dokuments[i]);
            }
        }
        return väljund;
    }
}
