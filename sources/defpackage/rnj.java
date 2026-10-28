package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.Spanned;
import android.text.SpannedString;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rnj {
    public final Object a;

    public rnj(qxi qxiVar, qxi qxiVar2) {
        this.a = new HashSet();
        if (qxiVar.d != qxiVar2.d) {
            c(rjh.b);
        }
        if (!qxiVar.c.equals(qxiVar2.c)) {
            c(rjh.a);
        }
        if (!o(qxiVar.e, qxiVar2.e)) {
            c(rjh.c);
        }
        if (!o(qxiVar.f, qxiVar2.f)) {
            c(rjh.d);
        }
        if (qxiVar.a.d.equals(qxiVar2.a.d)) {
            return;
        }
        c(rjh.e);
    }

    public static final Spanned n(String str, Object... objArr) {
        Spanned spannedC = aas.c(String.format(str.replace("%d", "%s").replace("$d", "$s"), objArr));
        int length = spannedC.length();
        while (length > 0) {
            int i = length - 1;
            if (!Character.isWhitespace(spannedC.charAt(i))) {
                break;
            }
            length = i;
        }
        return new SpannedString(spannedC.subSequence(0, length));
    }

    private static boolean o(qvu qvuVar, qvu qvuVar2) {
        if (qvuVar == null) {
            if (qvuVar2 == null) {
                return true;
            }
        } else if (qvuVar2 != null) {
            return qvuVar.m.equals(qvuVar2.m);
        }
        return false;
    }

    public final void a(int i, Integer num) {
        aihf aihfVarCreateBuilder = ajln.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajln ajlnVar = (ajln) aihfVarCreateBuilder.instance;
        ajlnVar.c = i - 1;
        ajlnVar.b |= 1;
        if (num != null) {
            int iIntValue = num.intValue();
            aihfVarCreateBuilder.copyOnWrite();
            ajln ajlnVar2 = (ajln) aihfVarCreateBuilder.instance;
            ajlnVar2.b |= 2;
            ajlnVar2.d = iIntValue;
        }
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.BIOMETRIC_AUTHENTICATION_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        ajln ajlnVar3 = (ajln) aihfVarCreateBuilder.build();
        ajlnVar3.getClass();
        alouVar.d = ajlnVar3;
        alouVar.c = 548;
        xeuVar.b((alou) alosVar.build());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rki) it.next()).a();
        }
    }

    protected final void c(rjh rjhVar) {
        ((HashSet) this.a).add(rjhVar);
    }

    public final boolean d(rjh rjhVar) {
        return ((HashSet) this.a).contains(rjhVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final String e() {
        return ((txp) this.a.io()).a();
    }

    public final void f(String str) {
        ((tre) this.a).h.g(str);
    }

    public final void g(int i) {
        ((tre) this.a).h.p(i);
    }

    public final boolean h(int i) {
        trj trjVar = ((tre) this.a).h.b;
        return trjVar.f(i) && trjVar.e.get(i) != null;
    }

    public final amjv i() {
        return (amjv) ((AtomicReference) this.a).get();
    }

    public final void j(teb tebVar) {
        ((awly) this.a).kk(tebVar);
    }

    public final long k() {
        return ((vxz) this.a).c(68, 45807487L, 120L) * 1000;
    }

    public final boolean l() {
        return ((vxz) this.a).l(205, 45807486L, false) && Build.VERSION.SDK_INT >= 35;
    }

    public final boolean m() {
        return ((vxz) this.a).l(ModuleDescriptor.MODULE_VERSION, 45822951L, false) && Build.VERSION.SDK_INT >= 35;
    }

    public rnj(Object obj) {
        this.a = obj;
    }

    public rnj(Context context) {
        this.a = aguu.al(new tar(context, 0));
    }

    public rnj(Context context, byte[] bArr) {
        this.a = context;
    }

    public rnj(byte[] bArr) {
        this.a = new CopyOnWriteArrayList();
    }

    public rnj(vxz vxzVar) {
        vxzVar.getClass();
        this.a = vxzVar;
    }

    public rnj(char[] cArr, byte[] bArr) {
        this.a = new awlo().az();
    }

    public rnj(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicReference();
    }

    public rnj(char[] cArr) {
        this.a = new rnj((Object) 0);
    }

    public rnj() {
        this.a = new HashSet();
    }
}
