package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wkl extends twv {
    final /* synthetic */ Context a;
    final /* synthetic */ vxu b;
    final /* synthetic */ vxz c;

    public wkl(Context context, vxu vxuVar, vxz vxzVar) {
        this.a = context;
        this.b = vxuVar;
        this.c = vxzVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0027 A[SYNTHETIC] */
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        boolean z;
        String str;
        String str2;
        String str3;
        amvc amvcVar = this.b.c().f;
        if (amvcVar == null) {
            amvcVar = amvc.a;
        }
        vxz vxzVar = this.c;
        aiie<amio> aiieVar = amvcVar.o;
        boolean zL = vxzVar.l(4, 45677082L, false);
        if (zL) {
            z = true;
            if (Build.VERSION.SDK_INT < 33) {
                zL = true;
                for (amio amioVar : aiieVar) {
                    if (ahno.ag(Build.MANUFACTURER, amioVar.d)) {
                        str = Build.MODEL;
                        if (amioVar.b == 2) {
                            str2 = (String) amioVar.c;
                        } else {
                            str2 = "";
                        }
                        if (ahno.ag(str, str2)) {
                            if (amioVar.b == 3) {
                                str3 = (String) amioVar.c;
                            } else {
                                str3 = "";
                            }
                            if (!str3.isEmpty()) {
                                continue;
                            } else if (Build.MODEL.toLowerCase(Locale.ROOT).startsWith((amioVar.b == 3 ? (String) amioVar.c : "").toLowerCase(Locale.ROOT))) {
                            }
                        }
                        return aloj.LARGE_FORM_FACTOR;
                    }
                }
                z = zL;
            }
        } else {
            while (r0.hasNext()) {
                if (ahno.ag(Build.MANUFACTURER, amioVar.d)) {
                    str = Build.MODEL;
                    if (amioVar.b == 2) {
                        str2 = (String) amioVar.c;
                    } else {
                        str2 = "";
                    }
                    if (ahno.ag(str, str2)) {
                        if (amioVar.b == 3) {
                            str3 = (String) amioVar.c;
                        } else {
                            str3 = "";
                        }
                        if (!str3.isEmpty()) {
                            continue;
                        } else if (Build.MODEL.toLowerCase(Locale.ROOT).startsWith((amioVar.b == 3 ? (String) amioVar.c : "").toLowerCase(Locale.ROOT))) {
                        }
                    }
                    return aloj.LARGE_FORM_FACTOR;
                }
            }
            z = zL;
        }
        return tym.H(this.a, z);
    }
}
