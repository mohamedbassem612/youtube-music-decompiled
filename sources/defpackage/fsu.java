package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.google.android.apps.youtube.music.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsu implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public fsu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v34, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v45, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v65, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v74, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [aunn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        fjc fjcVar;
        boolean zBooleanValue;
        int i = 12;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ComponentTree componentTree = ((fjw) this.a).w;
                if (componentTree == null || (fjcVar = componentTree.x) == null) {
                    return;
                }
                List list = fjcVar.g;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                }
                return;
            case 1:
                ((fsy) this.a).f.jW();
                return;
            case 2:
                ftl ftlVar = ((ftc) this.a).a;
                if (ftlVar == null || !ftlVar.b) {
                    return;
                }
                ftlVar.l(false, false);
                return;
            case 3:
                Object obj = this.a;
                if (((gak) obj).d == null) {
                    synchronized (gak.a) {
                        if (((gak) obj).d != null) {
                            return;
                        }
                        try {
                            zBooleanValue = ((Boolean) jwp.z.d()).booleanValue();
                            break;
                        } catch (IllegalStateException unused) {
                            zBooleanValue = false;
                        }
                        if (zBooleanValue) {
                            try {
                                gak.e = ahek.e(((gak) this.a).c.a, "ADSHIELD");
                                break;
                            } catch (Throwable unused2) {
                            }
                        }
                        z = zBooleanValue;
                        ((gak) this.a).d = Boolean.valueOf(z);
                        gak.a.open();
                        return;
                    }
                }
                return;
            case 4:
                jwm jwmVar = jwp.a;
                kro.E(new jwo(((gbg) this.a).a));
                return;
            case 5:
                Object obj2 = this.a;
                try {
                    gbg gbgVar = ((gcq) obj2).a;
                    Class clsLoadClass = gbgVar.c.loadClass(((gcq) obj2).a(gbgVar.e, ((gcq) obj2).b));
                    if (clsLoadClass != null) {
                        ((gcq) obj2).d = clsLoadClass.getMethod(((gcq) obj2).a(gbgVar.e, ((gcq) obj2).c), ((gcq) obj2).e);
                        Method method = ((gcq) obj2).d;
                    }
                    break;
                } catch (gau | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                } finally {
                    ((gcq) obj2).f.countDown();
                }
                return;
            case 6:
                ((get) this.a).r();
                return;
            case 7:
                View viewFindViewById = ((get) this.a).bh.findViewById(R.id.accessibility_layer_container);
                int i3 = bac.a;
                viewFindViewById.requestApplyInsets();
                return;
            case 8:
                BackupManager.dataChanged(((Context) this.a).getPackageName());
                return;
            case 9:
                axfd axfdVar = (axfd) ((gli) this.a).n.io();
                tbt tbtVar = (tbt) axfdVar.e;
                tbtVar.f(axfdVar.b);
                tbtVar.f(axfdVar.d);
                for (abnm abnmVar : axfdVar.a) {
                    abnn.a.put(abnmVar.c(), abnmVar);
                }
                Iterator it = axfdVar.c.iterator();
                while (it.hasNext()) {
                    ((abmv) it.next()).o();
                }
                return;
            case 10:
                ((gli) this.a).m.io();
                return;
            case 11:
                aerj aerjVar = (aerj) this.a;
                if (((isi) aerjVar.g.io()).R() && ((abfv) aerjVar.c.io()).r()) {
                    ((aajt) aerjVar.a.io()).c();
                    return;
                }
                return;
            case 12:
                ((ayq) ((gli) this.a).v.io()).w();
                return;
            case 13:
                ((axfd) ((gli) this.a).B.io()).aj();
                return;
            case 14:
                int i4 = tqr.a;
                gli gliVar = (gli) this.a;
                if (gliVar.E.k(1073830336)) {
                    ((abea) gliVar.C.io()).f();
                    return;
                }
                return;
            case 15:
                hed hedVar = (hed) ((jij) this.a).a.io();
                ((avlh) ((hfn) hedVar.b.io()).a).P().L((avmb) hedVar.c.io()).al(new gem(hedVar, 20), new gfh(i));
                return;
            case 16:
                gli gliVar2 = (gli) this.a;
                hws hwsVar = ((hwt) gliVar2.f.io()).d;
                abvn abvnVar = (abvn) gliVar2.j.io();
                int i5 = 1;
                int i6 = 11;
                gliVar2.D.e(((avlh) abvnVar.r().a).i(new abwr(i5)).al(new hwd(hwsVar, 10), new hpw(i6)), abvnVar.P().i(new abwr(i5)).al(new hwd(hwsVar, i6), new hpw(i6)), ((avlh) abvnVar.r().k).i(new abwr(i5)).al(new hwd(hwsVar, i), new hpw(i6)));
                return;
            case 17:
                jij jijVar = (jij) this.a;
                ((tbt) jijVar.b.io()).f(((xxz) jijVar.c.io()).b);
                return;
            case 18:
                ((aceo) ((gli) this.a).c.io()).f();
                return;
            case 19:
                ((ibn) ((gli) this.a).b.io()).b();
                return;
            default:
                ((hgd) ((gli) this.a).h.io()).a();
                return;
        }
    }

    public /* synthetic */ fsu(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
