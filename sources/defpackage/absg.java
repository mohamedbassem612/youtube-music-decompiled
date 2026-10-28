package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class absg implements abrf, abrd, wun, absk {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/player/playability/PlayabilityPolicy");
    public final Context b;
    protected final absl c;
    public awly d = new awlo();
    public ListenableFuture e = new aher(Boolean.FALSE);
    public absj f;
    public absn g;
    public avmn h;
    public aetc i;
    private WeakReference j;

    public absg(Context context, absl abslVar) {
        this.b = context;
        this.c = abslVar;
        abslVar.b(this);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0041  */
    /* JADX WARN: Code duplicated, block: B:30:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x004e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    /* JADX WARN: Code duplicated, block: B:39:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0063  */
    public static aboe h(alvl alvlVar, String str) {
        int i;
        boolean z;
        alvj alvjVar;
        int i2;
        alvj alvjVar2;
        aonx aonxVar;
        int i3 = alvlVar.c;
        aony aonyVarA = aony.a(i3);
        if (aonyVarA == null) {
            aonyVarA = aony.OK;
        }
        if (aonyVarA == aony.ERROR) {
            i = 2;
        } else {
            if (aonyVarA != aony.UNPLAYABLE && aonyVarA != aony.LIVE_STREAM_OFFLINE) {
                if (aaje.s(alvlVar)) {
                    aony aonyVarA2 = aony.a(i3);
                    if (aonyVarA2 == null) {
                        aonyVarA2 = aony.OK;
                    }
                    i = aonyVarA2 == aony.CONTENT_CHECK_REQUIRED ? 6 : 5;
                    z = true;
                } else {
                    i = 1;
                }
                alvjVar = alvlVar.g;
                if (alvjVar == null) {
                    alvjVar = alvj.a;
                }
                if (alvjVar.b == 109608350) {
                    alvjVar2 = alvlVar.g;
                    if (alvjVar2 == null) {
                        alvjVar2 = alvj.a;
                    }
                    if (alvjVar2.b == 109608350) {
                        aonxVar = (aonx) alvjVar2.c;
                    } else {
                        aonxVar = aonx.a;
                    }
                    if (true != aonxVar.b) {
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 1;
                }
                return new aboe(i, z, i2, alvlVar.e, null, str, null, aaje.m(alvlVar));
            }
            i = 3;
        }
        z = false;
        alvjVar = alvlVar.g;
        if (alvjVar == null) {
            alvjVar = alvj.a;
        }
        if (alvjVar.b == 109608350) {
            alvjVar2 = alvlVar.g;
            if (alvjVar2 == null) {
                alvjVar2 = alvj.a;
            }
            if (alvjVar2.b == 109608350) {
                aonxVar = (aonx) alvjVar2.c;
            } else {
                aonxVar = aonx.a;
            }
            if (true != aonxVar.b) {
                i2 = 3;
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        return new aboe(i, z, i2, alvlVar.e, null, str, null, aaje.m(alvlVar));
    }

    @Override // defpackage.wun
    public final void a(wuq wuqVar) {
        wuqVar.K = l().booleanValue();
        wuqVar.J = s();
    }

    protected abstract zwa b();

    protected void c(alvl alvlVar, sxu sxuVar, String str) {
        absh.a(sxuVar, h(alvlVar, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [absi, absj] */
    public void d(alvl alvlVar, sxu sxuVar, String str) {
        ?? r0 = this.f;
        if (r0 == 0) {
            absh.a(sxuVar, h(alvlVar, str));
            return;
        }
        absc abscVar = (absc) r0;
        abscVar.b = alvlVar.f;
        abscVar.c = alvlVar.e;
        abscVar.d = aaje.n(alvlVar);
        absb absbVar = new absb(abscVar, new abse(this, alvlVar, sxuVar, str), abscVar.f, abscVar.d);
        abscVar.e = new AlertDialog.Builder(abscVar.a).setTitle(abscVar.b).setMessage(abscVar.c).setPositiveButton(R.string.confirm, absbVar).setNegativeButton(R.string.cancel, absbVar).setOnCancelListener(absbVar).create();
        abscVar.e.show();
        r(r0);
    }

    public void e() {
        throw null;
    }

    protected abstract boolean g();

    @Override // defpackage.abrf
    public final void hX(abri abriVar) {
        final boolean zBooleanValue = l().booleanValue();
        abriVar.E = zBooleanValue;
        abriVar.D = s();
        abriVar.F(new abrh() { // from class: absd
            @Override // defpackage.abrh
            public final void a(dov dovVar) {
                dovVar.G("allowControversialContent", this.a.s());
                dovVar.G("allowAdultContent", zBooleanValue);
            }
        });
    }

    @Override // defpackage.abrd
    public final void hY(aihf aihfVar) {
        boolean zBooleanValue = l().booleanValue();
        aihfVar.copyOnWrite();
        aluc alucVar = (aluc) aihfVar.instance;
        aluc alucVar2 = aluc.a;
        alucVar.b |= 32;
        alucVar.j = zBooleanValue;
        boolean zS = s();
        aihfVar.copyOnWrite();
        aluc alucVar3 = (aluc) aihfVar.instance;
        alucVar3.b |= 64;
        alucVar3.k = zS;
    }

    public final aboe i(String str) {
        return new aboe(1, true, 1, this.b.getString(R.string.unplayable_reason_unknown), null, str, null, null);
    }

    public final absi j() {
        WeakReference weakReference = this.j;
        if (weakReference != null) {
            return (absi) weakReference.get();
        }
        return null;
    }

    protected final ListenableFuture k() {
        zwa zwaVarB = b();
        return (!g() || zwaVarB == null) ? new aher(Boolean.FALSE) : this.c.a(zwaVarB);
    }

    protected final Boolean l() {
        Boolean bool = Boolean.FALSE;
        if (this.e.isDone()) {
            return (Boolean) taf.f(this.e, bool);
        }
        this.e = ahng.n(bool);
        return bool;
    }

    public final void m(alvl alvlVar, absm absmVar, aoqt aoqtVar, sxu sxuVar, String str) {
        Object obj = this.h;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.h = null;
        }
        aetc aetcVar = this.i;
        if (aetcVar == null || aetcVar.a == null) {
            this.h = this.d.ag(new vaw(this, alvlVar, absmVar, aoqtVar, sxuVar, str, 2), new xuk(19));
        } else {
            aetcVar.a(aoqtVar, absmVar, b(), new absf(this, alvlVar, str, sxuVar));
        }
    }

    public void n() {
        ViewGroup viewGroup;
        aetc aetcVar = this.i;
        if (aetcVar == null || (viewGroup = aetcVar.a) == null) {
            return;
        }
        viewGroup.removeAllViews();
        tuk.l(viewGroup, false);
    }

    protected final void p() {
        zwa zwaVarB = b();
        if (!g() || zwaVarB == null) {
            return;
        }
        absl abslVar = this.c;
        String strE = absl.e(zwaVarB);
        Iterator it = abslVar.b.iterator();
        while (it.hasNext()) {
            ((absk) it.next()).t(zwaVarB);
        }
        taf.j(abslVar.a.b(new aaoz(strE, 12)), new ztb(16));
    }

    public final void q(boolean z) {
        this.c.c = z;
    }

    protected final void r(absi absiVar) {
        this.j = new WeakReference(absiVar);
    }

    protected final boolean s() {
        return this.c.c;
    }

    @Override // defpackage.absk
    public final void t(zwa zwaVar) {
        if (!g()) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/playability/PlayabilityPolicy", "onAdultConfirmationChanged", 80, "PlayabilityPolicy.java")).t("PlayabilityUtil Change: not signed in");
        } else if (zwaVar.equals(b())) {
            this.e = ahng.n(Boolean.TRUE);
        } else {
            this.e = this.c.a(zwaVar);
        }
    }

    public final void u(aetc aetcVar, absn absnVar) {
        this.i = aetcVar;
        this.g = absnVar;
        o();
    }

    protected void o() {
    }
}
