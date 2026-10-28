package defpackage;

import android.view.MotionEvent;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adgu extends oyk {
    public static final /* synthetic */ int e = 0;
    public mew a;
    public mew b;
    public mew c;
    public mew d;
    private final awmi f;

    public adgu(NodeTreeProcessor nodeTreeProcessor) {
        super(nodeTreeProcessor);
        this.f = new awmp(new efi(this, nodeTreeProcessor, 12, null));
        mew mewVar = atcl.a;
        mewVar.getClass();
        this.a = mewVar;
        mewVar.getClass();
        this.b = mewVar;
        mewVar.getClass();
        this.c = mewVar;
        mewVar.getClass();
        this.d = mewVar;
        r(new adgr(this, 0));
    }

    public final adgq D() {
        return (adgq) this.f.a();
    }

    public final ors f(adgo adgoVar) {
        orr orrVarB = ors.b();
        orrVarB.e(this);
        atoc atocVar = new atoc((byte[]) null);
        mep mepVar = astj.d;
        astf astfVar = new astf();
        astfVar.aS();
        astfVar.bO(8, 4);
        astfVar.bK(9, adgoVar.b);
        atkp atkpVar = new atkp();
        atkpVar.aR(adgoVar.c);
        atkpVar.aS(0.0f);
        atks atksVarAT = atkpVar.aT();
        if (atksVarAT != astfVar.g) {
            astfVar.g = atksVarAT;
            astfVar.e = true;
        }
        atmx atmxVar = new atmx();
        atmxVar.aS(adgoVar.d);
        atmxVar.aR(adgoVar.e);
        atna atnaVarAT = atmxVar.aT();
        if (atnaVarAT != astfVar.h) {
            astfVar.h = atnaVarAT;
            astfVar.f = true;
        }
        if (astfVar.d) {
            astfVar.bG();
        } else {
            astfVar.d = true;
        }
        astj astjVar = new astj(astfVar.b);
        if (astfVar.g != null) {
            astjVar.g = astfVar.g;
            astjVar.e = astfVar.e;
        }
        if (astfVar.h != null) {
            astjVar.h = astfVar.h;
            astjVar.f = astfVar.f;
        }
        astjVar.bJ();
        atocVar.aS(mepVar, astjVar);
        orrVarB.g = atocVar.aT();
        return orrVarB.a();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return D().b(this, motionEvent);
    }
}
