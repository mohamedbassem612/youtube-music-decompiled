package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hms implements aaui {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    public final /* synthetic */ hmt d;

    public hms(hmt hmtVar, boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = hmtVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // defpackage.aaui
    public final void a() {
        String str;
        hmt hmtVar;
        abvk abvkVar;
        tbt tbtVar;
        abvc abvcVar;
        abtu abtuVar;
        if (this.a) {
            String str2 = this.b;
            hmt hmtVar2 = this.d;
            abvk abvkVar2 = hmtVar2.g;
            if (str2.equals(abvkVar2.m())) {
                hna.l(abvkVar2, hmtVar2.i);
            } else {
                str = this.c;
                String str3 = this.b;
                hmtVar = this.d;
                typ.f(str);
                abvkVar = hmtVar.g;
                abvkVar.getClass();
                tbtVar = hmtVar.i;
                tbtVar.getClass();
                Matcher matcher = Pattern.compile(str3).matcher(typ.c(abvkVar.m()));
                if (str.equals(abvkVar.n()) && matcher.matches()) {
                    abvcVar = hmtVar.h;
                    abtuVar = abtu.c;
                    if (abvcVar.n(abtuVar)) {
                        abvcVar.i(abtuVar);
                    } else {
                        hna.l(abvkVar, tbtVar);
                    }
                }
            }
        } else {
            str = this.c;
            String str4 = this.b;
            hmtVar = this.d;
            typ.f(str);
            abvkVar = hmtVar.g;
            abvkVar.getClass();
            tbtVar = hmtVar.i;
            tbtVar.getClass();
            Matcher matcher2 = Pattern.compile(str4).matcher(typ.c(abvkVar.m()));
            if (str.equals(abvkVar.n())) {
                abvcVar = hmtVar.h;
                abtuVar = abtu.c;
                if (abvcVar.n(abtuVar)) {
                    abvcVar.i(abtuVar);
                } else {
                    hna.l(abvkVar, tbtVar);
                }
            }
        }
        hmt hmtVar3 = this.d;
        hmtVar3.c.a(this.c, this.b).B(new gkq(13)).am().s(hmtVar3.l).C(new hib(this, 6), new hmd(4));
    }
}
