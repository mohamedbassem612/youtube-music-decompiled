package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.libraries.video.mediaengine.logging.QosContainer;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rbm {
    public final Object a;
    public Object b;

    public rbm(awmd awmdVar, vxi vxiVar) {
        Optional optionalOf;
        this.b = Optional.empty();
        Container containerC = ((QosContainer) awmdVar.io()).c(asbq.a, null);
        this.a = containerC;
        if (vxiVar.a) {
            afyt afytVar = (afyt) containerC.a(new afyq(2));
            try {
                agbs agbsVar = (agbs) containerC.a(new afyq(15));
                try {
                    optionalOf = Optional.of(k(afytVar, agbsVar));
                    agbsVar.close();
                    afytVar.close();
                } catch (Throwable th) {
                    try {
                        agbsVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    afytVar.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } else {
            optionalOf = Optional.of(k((afyt) containerC.a(new afyq(2)), (agbs) containerC.a(new afyq(15))));
        }
        this.b = optionalOf;
    }

    static final void b(Level level, Throwable th, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        String str2 = String.format(Locale.US, str, objArr);
        sb.append(level);
        sb.append(": ");
        sb.append(str2);
        sb.append('\n');
        if (th != null) {
            sb.append(th);
            sb.append('\n');
        }
        sb.toString().trim();
    }

    public static rbm c(Class cls) {
        return new rbm(cls.getSimpleName());
    }

    public static opq i(ElementsServices elementsServices) {
        agfr agfrVarO;
        opq opqVar;
        if (elementsServices == null || (agfrVarO = elementsServices.o()) == null || (opqVar = (opq) agfrVarO.io()) == null || !opqVar.c()) {
            return null;
        }
        return opqVar;
    }

    private final agbv k(afyt afytVar, agbs agbsVar) {
        agbv agbvVar = (agbv) ((may) this.a).a(new afyq(16));
        aihf aihfVarCreateBuilder = aska.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ascl.a.createBuilder();
        String strH = afytVar.h();
        aihfVarCreateBuilder2.copyOnWrite();
        ascl asclVar = (ascl) aihfVarCreateBuilder2.instance;
        strH.getClass();
        asclVar.b |= 1;
        asclVar.c = strH;
        ascl asclVar2 = (ascl) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        aska askaVar = (aska) aihfVarCreateBuilder.instance;
        asclVar2.getClass();
        askaVar.d = asclVar2;
        askaVar.b |= 2;
        aihf aihfVarCreateBuilder3 = askk.a.createBuilder();
        String strH2 = agbsVar.h();
        aihfVarCreateBuilder3.copyOnWrite();
        askk askkVar = (askk) aihfVarCreateBuilder3.instance;
        strH2.getClass();
        askkVar.b |= 1;
        askkVar.c = strH2;
        askk askkVar2 = (askk) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder.copyOnWrite();
        aska askaVar2 = (aska) aihfVarCreateBuilder.instance;
        askkVar2.getClass();
        askaVar2.c = askkVar2;
        askaVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aska askaVar3 = (aska) aihfVarCreateBuilder.instance;
        askaVar3.b |= 4;
        askaVar3.e = false;
        aska askaVar4 = (aska) aihfVarCreateBuilder.build();
        agbvVar.i();
        aigv aigvVar = aigv.a;
        return agbvVar;
    }

    public final synchronized void a(auet auetVar) {
        this.b = auetVar;
    }

    public final void d() {
        if (((Animator) this.b).isStarted()) {
            ((Animator) this.b).end();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oou] */
    public final void e(oou oouVar) {
        ?? r0 = this.b;
        if (r0 != 0 && !r0.equals(oouVar)) {
            r0.b();
        }
        this.b = oouVar;
    }

    public final void f(View view) {
        if (this.b != null) {
            bac.p(view, null);
            this.b = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, opt] */
    public final void g(View view, ooo oooVar) {
        this.b = oooVar;
        if (oooVar != null) {
            oooVar.a = this.a;
        }
        bac.p(view, oooVar);
    }

    public final boolean h(MotionEvent motionEvent) {
        mew mewVarBd;
        Object obj = this.b;
        if (obj != null) {
            opv opvVar = (opv) obj;
            AccessibilityManager accessibilityManager = opvVar.d;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    opr oprVar = (opr) obj;
                    View view = oprVar.b;
                    float scrollX = view.getScrollX();
                    float scrollY = view.getScrollY();
                    List list = oprVar.c;
                    int i = -1;
                    for (int size = list.size() - 1; size >= 0; size--) {
                        asut asutVar = (asut) list.get(size);
                        if (asutVar.bb() == 2 && (mewVarBd = asutVar.bd()) != null && opr.g(mewVarBd).contains((int) (x + scrollX), (int) (y + scrollY))) {
                            i = size;
                            break;
                        }
                    }
                    opvVar.i(i);
                } else if (action == 10 && opvVar.g != Integer.MIN_VALUE) {
                    opvVar.i(Integer.MIN_VALUE);
                }
                return true;
            }
        }
        return false;
    }

    public final synchronized void j(Map map) {
        map.put("oe", this.b);
        Object obj = this.a;
        map.put("ro", ((ArrayDeque) obj).toArray(new obz[((ArrayDeque) obj).size()]));
        this.b = new nrl();
        ((ArrayDeque) obj).clear();
    }

    public rbm(opt optVar) {
        this.a = optVar;
    }

    public rbm() {
        this.a = new WeakHashMap();
        this.b = null;
    }

    public rbm(String str) {
        this.a = agrf.h(str);
    }

    public rbm(byte[] bArr) {
        this.a = new ArrayDeque();
        this.b = new nrl();
    }

    public rbm(Snackbar snackbar) {
        this.b = new AnimatorSet();
        this.a = snackbar;
    }
}
