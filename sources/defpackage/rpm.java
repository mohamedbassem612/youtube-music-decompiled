package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rpm {
    /* JADX WARN: Code duplicated, block: B:51:0x00f7 A[EDGE_INSN: B:51:0x00f7->B:52:0x00f8 BREAK  A[LOOP:3: B:45:0x00db->B:69:?]] */
    public static void a(Context context, Consumer consumer, Consumer consumer2, Consumer consumer3, wnt wntVar) {
        Throwable th;
        wnr wnrVarA;
        Iterator it = wntVar.c().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((wns) it.next()).a() != null) {
                i++;
            }
        }
        agke agkeVarN = agke.n(wntVar.c());
        airo airoVarA = wntVar.a();
        if (airoVarA != null) {
            consumer.r(airoVarA);
            int size = agkeVarN.size();
            int i2 = 0;
            while (i2 < size) {
                wns wnsVar = (wns) agkeVarN.get(i2);
                i2++;
                if (!wnsVar.b) {
                    consumer2.r(wnsVar);
                    break;
                }
            }
            akrq akrqVarB = wntVar.b();
            if (akrqVarB != null) {
                aihf builder = akrqVarB.toBuilder();
                float integer = (akrqVarB.b & 4) != 0 ? akrqVarB.e : context.getResources().getInteger(R.integer.account_switcher_separator_padding_dp);
                builder.copyOnWrite();
                akrq akrqVar = (akrq) builder.instance;
                akrqVar.b |= 4;
                akrqVar.e = integer;
                consumer.r(new adll((akrq) builder.build()));
            }
            if (agkeVarN.size() > 1) {
                consumer.r(new rpu());
            }
        }
        int size2 = agkeVarN.size();
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size2; i3++) {
            wns wnsVar2 = (wns) agkeVarN.get(i3);
            if (i > 1 && (wnrVarA = wnsVar2.a()) != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(wnrVarA.b);
            } else if (wnsVar2.b) {
                consumer2.r(wnsVar2);
            }
        }
        consumer3.r(wntVar.d());
        if (i > 1) {
            if (arrayList == null) {
                th = null;
                break;
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext() || (th = (Throwable) it2.next()) == null) {
                th = null;
                break;
            }
            while (it2.hasNext()) {
                Throwable th2 = (Throwable) it2.next();
                if (th2 == null || !th.getClass().equals(th2.getClass())) {
                    th = null;
                    break;
                }
            }
            consumer.r(new wnr(null, th));
        }
    }

    public static void b(sol solVar, int i, int i2, int i3) {
        solVar.k(i);
        solVar.j(i2);
        solVar.l(i3);
    }

    public static void c(sol solVar, aolc aolcVar) {
        heg hegVar = new heg((char[]) null);
        hegVar.r(aolc.a);
        if (aolcVar != null) {
            hegVar.r(aolcVar);
        }
        solVar.h = hegVar.q();
    }
}
