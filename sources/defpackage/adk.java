package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Banner;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Row;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adk {
    public static final adk a;
    public static final adk b;
    public final int c;
    public final adi d;
    public final boolean e;

    static {
        adj adjVar = new adj();
        adjVar.a = 0;
        adjVar.b = adi.b;
        adjVar.c = false;
        adk adkVar = new adk(adjVar);
        a = adkVar;
        adj adjVar2 = new adj(adkVar);
        adjVar2.a = 2;
        adjVar2.b = adi.c;
        adjVar2.c = false;
        new adj(adkVar).b = adi.d;
        adj adjVar3 = new adj(adkVar);
        adjVar3.b = adi.d;
        adjVar3.c = true;
        adj adjVar4 = new adj(adkVar);
        adjVar4.b = adi.d;
        adjVar4.c = true;
        adj adjVar5 = new adj(adkVar);
        adjVar5.b = adi.e;
        adjVar5.c = true;
        b = new adk(adjVar5);
    }

    public adk(adj adjVar) {
        this.c = adjVar.a;
        this.d = adjVar.b;
        this.e = adjVar.c;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abc abcVar = (abc) it.next();
            if (abcVar instanceof Row) {
                adi adiVar = this.d;
                Row row = (Row) abcVar;
                if (!adiVar.j && row.getOnClickDelegate() != null) {
                    throw new IllegalArgumentException("A click listener is not allowed on the row");
                }
                if (!adiVar.i && row.getToggle() != null) {
                    throw new IllegalArgumentException("A toggle is not allowed on the row");
                }
                CarIcon image = row.getImage();
                if (image != null) {
                    if (!adiVar.h) {
                        throw new IllegalArgumentException("An image is not allowed on the row");
                    }
                    adiVar.k.a(image);
                }
                int size = row.getTexts().size();
                int i = adiVar.f;
                if (size > i) {
                    throw new IllegalArgumentException(a.bR(i, "The number of lines of texts for the row exceeded the supported max of "));
                }
            } else if (!(abcVar instanceof ConversationItem) && !(abcVar instanceof Banner)) {
                throw new IllegalArgumentException(String.format("Unsupported item type: %s", abcVar.getClass().getSimpleName()));
            }
        }
    }
}
