package defpackage;

import com.google.android.libraries.elements.interfaces.MissingResourceHandler;
import com.youtube.android.libraries.elements.StatusOr;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wal extends MissingResourceHandler {
    public final afip a;
    private final awmd b;

    public wal(afip afipVar, awmd awmdVar) {
        this.a = afipVar;
        this.b = awmdVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.MissingResourceHandler
    public final StatusOr getResources(ArrayList arrayList) {
        wal walVar;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = (String) arrayList.get(i);
            if (this.a.ab(str)) {
                walVar = this;
                ((wah) this.b.io()).a("DataPushMissingResourceHandling", new dzn(walVar, arrayList2, str, 9, (char[]) null));
            } else {
                walVar = this;
            }
            i++;
            this = walVar;
        }
        return StatusOr.fromValue(arrayList2);
    }
}
