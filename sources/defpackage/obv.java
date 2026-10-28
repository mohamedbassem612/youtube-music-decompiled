package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obv implements aupn {
    private final /* synthetic */ int $cid;
    private final aupr a;
    private final aupr b;
    private final aupr c;
    private final aupr d;
    private final aupr e;
    private final aupr f;
    private final Object g;

    public obv(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, aupr auprVar7, int i) {
        this.$cid = i;
        this.a = auprVar;
        this.g = auprVar2;
        this.b = auprVar3;
        this.c = auprVar4;
        this.d = auprVar5;
        this.e = auprVar6;
        this.f = auprVar7;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53, types: [ahex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v60, types: [ahex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [ahex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v75, types: [ahex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aupr, java.lang.Object] */
    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        switch (this.$cid) {
            case 0:
                Object obj = ((aupo) this.d).b;
                aupr auprVar = this.c;
                aupr auprVar2 = this.b;
                return new obu(aupm.b(this.a), aupm.b(this.g), aupm.b(auprVar2), aupm.b(auprVar), (oaq) obj, (ExecutorService) ((aupo) this.e).b, (omj) this.f.io());
            case 1:
                obj objVar = (obj) this.g.io();
                obw obwVar = (obw) this.c.io();
                return new oao(objVar, obwVar, (omj) this.f.io(), (obc) this.d.io(), aupm.b(this.e), (oaq) ((aupo) this.a).b);
            case 2:
                aupr auprVar3 = this.f;
                aupr auprVar4 = this.b;
                Object obj2 = ((aupo) this.g).b;
                aunn aunnVarB = aupm.b(this.a);
                aunn aunnVarB2 = aupm.b(auprVar4);
                omj omjVar = (omj) auprVar3.io();
                return new oby((ExecutorService) obj2, aunnVarB, aunnVarB2, omjVar, aupm.b(this.e), this.c);
            case 3:
                Context context = (Context) ((aupo) this.e).b;
                ExecutorService executorService = (ExecutorService) ((aupo) this.a).b;
                ocd ocdVar = (ocd) this.b.io();
                oct octVar = (oct) this.d.io();
                File file = (File) this.g.io();
                omj omjVar2 = (omj) this.f.io();
                oaq oaqVar = (oaq) ((aupo) this.c).b;
                agkz agkzVarU = agkz.u(new isi("vuRc5gv6qT2CEWHNWhZP7S2O3rAKRDBQl1C5dAi6sy4N/MyItpNkO8gyWgzJ2AmF", "lmRx+mF8MCYuWADZY0Lffq6s/pVPiSOyaI3sVfaTEz8=", new Class[]{Context.class}), new isi("JJ4KrwFHkV1ukdS2bZ7MUShG75S4Q+6p6IAUhLVaho16LfjWT/gWuchTnsiKt5hw", "+20BpoCG4bEdW2TguzLdWbDouqNomyRYIOWwyiuBbZ0=", new Class[0]), new isi("OIHjUnras6VexaBew92tZWT9UXIp7Ii9j0Jz2oMBGOXrVoYbfH3Dr3jwFahhbU73", "ISyVtAMdHwUVBtUoed3yeIQ6LffDXO6Qzz2cj8NSwCc=", new Class[]{NetworkCapabilities.class, Long.class, Long.class}), new isi("1M4+hxwujOoOvrpbv36I0eEIxunNoofYm52entdtD2srJEuq03lWB21y7tOqma6M", "Gzh3mJDMDDQeA5KLWRGOz648iXOQVbAe3h9do204Oto=", new Class[]{String.class}), new isi("T47lOCc433ScbabO/oYhFOBK3Nr5G3x8jGK9yjRkNujf5x/Na3ZhrCzVhd1Tl/xi", "JYSAUkxi+o3sEei2UmJqdRnylADpDuN4tFF71qo+leg=", new Class[]{View.class, Activity.class}), new isi("Rw63/FLQT3OSI1GlrzmEKu37lW2JG7GKqNmVk7qYCJQp0II17NouJVvKKl1eVNG5", "Nd77uDwkYtE8aAuPFS45O2ZaLWm4qtHrfizobYbKkPM=", new Class[]{DisplayMetrics.class, View.class}), new isi("Ig54C4HkxKGmba9akO3LJXn9K1puUA3SO14/+XDmtlV5+VzEDiGjIpvOeUWhbBE/", "OwwY29bMiNq1I+JVOkuvok8Z+jykc/OLsRnpOv6oGnc=", new Class[]{Long[].class, Integer.class}), new isi("R64IbQ+Acj3SXeG3OKTuHk8afjJvVJqheDOoeCeCiSyiMKb+sJPKZH5aCeuEiO+b", "z+ZYM6cHxnORj3V7OG1dd8cDd1Vbe6h8vm6Z8GBlGUk=", new Class[0]), new isi("WRrNJ3FQlC6uYpskQI9/jcKlkyPIKxlx8wARdW34wSEm6VKghlkWreJdpvmqs1sv", "8rVANTfkyC31okTNQXUzqpf2FOVDgWzSNoXCC+JAlQ8=", new Class[]{Context.class, Integer.class}), new isi("uaRdl4l7lbt5laDuma33BeC1gWmdyH8hgI5dc4sXqvxjv21uyRobpLaWA9nfWeim", "83McyTo46jCEa8S46soNz7XvsXjaEF7RCdA7XYc9UZk=", new Class[]{Integer.class, Context.class, Boolean.class}), new isi("3WwgEdMWvzrZ7qPBXm9NxnubUCO3yZKs5JZZfvbAA+VggTZJBX/oghrFHavf4t+E", "oHIN/Y4zAL1wY+vdgCDL9l3iq4VgmlsNbHbRiCW0UZU=", new Class[]{Context.class}), new isi("wtOutrKD3hWMm3gJP3P1SgIQgTxxRfDThny9MWuCT8MUJ7KZ3ksYwnJllDow24H/", "sCpbqDzM57omH4iujdDxzg9yfO2HvEUDj0KumxP4qk4=", new Class[]{Context.class}), new isi("Db5QZzhZv9oUu580+bJckQOthvZIXdsdaf0cxWg631H9Hxia2qy+HtjJTBIhisD1", "0NmnaiixCnyjEp6vEpm9tIVmZRZQWh6HSg+6MqfekvM=", new Class[]{MotionEvent.class, DisplayMetrics.class}), new isi("thCKzhUypzE8TMzygz72soeMITmDG9sKdmaAC7DYUCFf47TzyBtvya3VT3TpE0GG", "gpzw/CBNQ/+VLbCFN3Xt6yW5IVabe88UQEUJBgKghVA=", new Class[]{MotionEvent.class, DisplayMetrics.class}), new isi("TZjLQwLRvN2aVaWU9XKfnHCeOMydE5bY1Uxxti4G3kE6QAFtp+A3UajK+DfHRFsI", "f+Yz8FbU7vWhbjj74zwgzdyu9EAZaaUwGeKucaRT7qc=", new Class[]{List.class}), new isi("9nxKYhfU1IUmJ/43w8MihgicGHz41muMj6vlRggbFuLCKymCNRNP1dzWZTkfNBjs", "IzI5chKXSpLzLuC8CcgdimjiUYx/nMJE2s5sVtD4D1s=", new Class[]{InputEvent.class, Context.class}));
                agkzVarU.getClass();
                return new ocu(context, executorService, ocdVar, octVar, file, omjVar2, oaqVar.s, agkzVarU);
            case 4:
                return new ocy((fxg) ((aupo) this.d).b, (ocu) this.e.io(), (Map) ((aupo) this.b).b, (Context) ((aupo) this.g).b, (obb) ((aupo) this.c).b, (oaq) ((aupo) this.a).b, (omj) this.f.io());
            case 5:
                aupr auprVar5 = this.a;
                Context contextB = ((omk) this.e).io();
                Uri uri = (Uri) auprVar5.io();
                ong ongVar = (ong) this.b.io();
                aupr auprVar6 = this.c;
                omj omjVarB = ((olr) this.f).io();
                agev agevVar = (agev) auprVar6.io();
                qrl qrlVarA = qrm.a();
                qrlVarA.f(uri);
                qrlVarA.e(oiu.a);
                qrlVarA.g(false);
                omr omrVar = (omr) this.g;
                qrlVarA.b(qnl.aV(contextB, omrVar.a, ongVar, omjVarB, agevVar));
                qrx qrxVarC = ((rrq) omrVar.b).c(qrlVarA.a());
                qrxVarC.getClass();
                return qrxVarC;
            case 6:
                aupr auprVar7 = this.a;
                Context contextB2 = ((omk) this.e).io();
                Uri uri2 = (Uri) auprVar7.io();
                ong ongVar2 = (ong) this.b.io();
                aupr auprVar8 = this.c;
                omj omjVarB2 = ((olr) this.f).io();
                agev agevVar2 = (agev) auprVar8.io();
                qrl qrlVarA2 = qrm.a();
                qrlVarA2.f(uri2);
                qrlVarA2.e(ojc.a);
                qrlVarA2.g(false);
                omr omrVar2 = (omr) this.g;
                qrlVarA2.b(qnl.aW(contextB2, omrVar2.a, ongVar2, omjVarB2, agevVar2));
                qrx qrxVarC2 = ((rrq) omrVar2.b).c(qrlVarA2.a());
                qrxVarC2.getClass();
                return qrxVarC2;
            case 7:
                aupr auprVar9 = this.a;
                Context contextB3 = ((omk) this.e).io();
                Uri uri3 = (Uri) auprVar9.io();
                ong ongVar3 = (ong) this.b.io();
                aupr auprVar10 = this.c;
                omj omjVarB3 = ((olr) this.f).io();
                agev agevVar3 = (agev) auprVar10.io();
                qrl qrlVarA3 = qrm.a();
                qrlVarA3.f(uri3);
                qrlVarA3.e(oiu.a);
                qrlVarA3.g(false);
                omr omrVar3 = (omr) this.g;
                qrlVarA3.b(qnl.aV(contextB3, omrVar3.a, ongVar3, omjVarB3, agevVar3));
                qrx qrxVarC3 = ((rrq) omrVar3.b).c(qrlVarA3.a());
                qrxVarC3.getClass();
                return qrxVarC3;
            default:
                aupr auprVar11 = this.a;
                Context contextB4 = ((omk) this.e).io();
                Uri uri4 = (Uri) auprVar11.io();
                ong ongVar4 = (ong) this.b.io();
                aupr auprVar12 = this.c;
                omj omjVarB4 = ((olr) this.f).io();
                agev agevVar4 = (agev) auprVar12.io();
                qrl qrlVarA4 = qrm.a();
                qrlVarA4.f(uri4);
                qrlVarA4.e(ojc.a);
                qrlVarA4.g(false);
                omr omrVar4 = (omr) this.g;
                qrlVarA4.b(qnl.aW(contextB4, omrVar4.a, ongVar4, omjVarB4, agevVar4));
                qrx qrxVarC4 = ((rrq) omrVar4.b).c(qrlVarA4.a());
                qrxVarC4.getClass();
                return qrxVarC4;
        }
    }

    public obv(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, aupr auprVar7, int i, byte[] bArr) {
        this.$cid = i;
        this.g = auprVar;
        this.c = auprVar2;
        this.b = auprVar3;
        this.f = auprVar4;
        this.d = auprVar5;
        this.e = auprVar6;
        this.a = auprVar7;
    }

    public obv(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, aupr auprVar7, int i, char[] cArr) {
        this.$cid = i;
        this.g = auprVar;
        this.a = auprVar2;
        this.b = auprVar3;
        this.f = auprVar4;
        this.e = auprVar5;
        this.c = auprVar6;
        this.d = auprVar7;
    }

    public obv(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, aupr auprVar7, int i, int[] iArr) {
        this.$cid = i;
        this.d = auprVar;
        this.e = auprVar2;
        this.b = auprVar3;
        this.g = auprVar4;
        this.c = auprVar5;
        this.a = auprVar6;
        this.f = auprVar7;
    }

    public obv(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, aupr auprVar7, int i, short[] sArr) {
        this.$cid = i;
        this.e = auprVar;
        this.a = auprVar2;
        this.b = auprVar3;
        this.d = auprVar4;
        this.g = auprVar5;
        this.f = auprVar6;
        this.c = auprVar7;
    }

    public obv(omr omrVar, aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, int i) {
        this.$cid = i;
        this.g = omrVar;
        this.e = auprVar;
        this.a = auprVar2;
        this.d = auprVar3;
        this.b = auprVar4;
        this.f = auprVar5;
        this.c = auprVar6;
    }
}
