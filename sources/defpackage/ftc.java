package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftc {
    public ftl a;
    public mik b;
    private final Runnable d = new fsu(this, 2);
    public int c = Alert.DURATION_SHOW_INDEFINITELY;

    public final RecyclerView a() {
        ftl ftlVar = this.a;
        if (ftlVar == null) {
            return null;
        }
        return ftlVar.l;
    }

    public final void b() {
        ftl ftlVar = this.a;
        if (ftlVar == null || !ftlVar.b) {
            return;
        }
        if (gzj.aT()) {
            ftlVar.l(false, false);
            return;
        }
        Runnable runnable = this.d;
        ftlVar.removeCallbacks(runnable);
        ftlVar.post(runnable);
    }

    final void c(ftl ftlVar) {
        adfx adfxVar;
        mlf mlfVar;
        int i;
        int decoratedTop;
        int paddingTop;
        this.a = ftlVar;
        mik mikVar = this.b;
        if (mikVar != null) {
            RecyclerView recyclerView = ftlVar == null ? null : ftlVar.l;
            RecyclerView recyclerView2 = mikVar.a;
            if (recyclerView != null) {
                ci ciVar = mikVar.j;
                if (ciVar != null && (adfxVar = mikVar.i) != null) {
                    if (recyclerView != recyclerView2 && recyclerView2 != null) {
                        ciVar.aj(recyclerView2);
                    }
                    Object obj = ciVar.a;
                    aeqf aeqfVar = new aeqf();
                    aeqfVar.b(adfxVar.a);
                    ((aepz) obj).m(recyclerView, aeqfVar.a());
                }
                if (mikVar.g) {
                    if (recyclerView == recyclerView2 || recyclerView2 == null) {
                        npv npvVar = mikVar.b;
                        if (npvVar != null && npvVar != mikVar.h.get()) {
                            mikVar.a(recyclerView);
                        }
                    } else {
                        mikVar.a(recyclerView2);
                    }
                    mikVar.b = (npv) mikVar.h.get();
                }
                mikVar.a = recyclerView;
                return;
            }
            if (recyclerView2 != null) {
                ci ciVar2 = mikVar.j;
                if (ciVar2 != null && mikVar.i != null) {
                    ciVar2.aj(recyclerView2);
                }
                if (mikVar.c && (mlfVar = mikVar.d) != null) {
                    nsl nslVar = mikVar.e;
                    boolean z = mikVar.f;
                    String str = mio.a;
                    np npVar = recyclerView2.n;
                    if (npVar instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
                        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                        if (viewFindViewByPosition != null) {
                            if (z) {
                                decoratedTop = linearLayoutManager.getDecoratedLeft(viewFindViewByPosition);
                                paddingTop = linearLayoutManager.getPaddingLeft();
                            } else {
                                decoratedTop = linearLayoutManager.getDecoratedTop(viewFindViewByPosition);
                                paddingTop = linearLayoutManager.getPaddingTop();
                            }
                            i = decoratedTop - paddingTop;
                        } else {
                            i = 0;
                        }
                        String str2 = nslVar.n;
                        aihh aihhVar = (aihh) mqt.a.createBuilder();
                        aihl aihlVar = mqs.b;
                        aihf aihfVarCreateBuilder = mqs.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        mqs mqsVar = (mqs) aihfVarCreateBuilder.instance;
                        mqsVar.c |= 1;
                        mqsVar.d = iFindFirstVisibleItemPosition;
                        aihfVarCreateBuilder.copyOnWrite();
                        mqs mqsVar2 = (mqs) aihfVarCreateBuilder.instance;
                        mqsVar2.c |= 2;
                        mqsVar2.e = i;
                        aihhVar.e(aihlVar, (mqs) aihfVarCreateBuilder.build());
                        mlfVar.e(str2, (mqt) aihhVar.build());
                    }
                }
                if (!mikVar.g || mikVar.h.get() == mikVar.b) {
                    return;
                }
                mikVar.a(recyclerView2);
            }
        }
    }

    public final void d(boolean z, int i, int i2, od odVar) {
        np npVar;
        RecyclerView recyclerViewA = a();
        if (recyclerViewA == null || (npVar = recyclerViewA.n) == null || recyclerViewA.isLayoutSuppressed()) {
            return;
        }
        int i3 = 1;
        if (z) {
            if (odVar == null) {
                Context context = recyclerViewA.getContext();
                int i4 = this.c;
                if (i4 == -1) {
                    i3 = 6;
                } else if (i4 != 1) {
                    switch (i4) {
                        case 2147483646:
                        case Alert.DURATION_SHOW_INDEFINITELY /* 2147483647 */:
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                } else {
                    i3 = 8;
                }
                odVar = gzj.aL(context, i3);
            }
            odVar.b = i2;
            npVar.startSmoothScroll(odVar);
            return;
        }
        if (this.c != -1) {
            f(i);
            if (npVar.canScrollVertically()) {
                e(0, 1);
                return;
            } else {
                e(1, 0);
                return;
            }
        }
        ftl ftlVar = this.a;
        if (ftlVar != null) {
            np npVar2 = ftlVar.l.n;
            if (npVar2 instanceof LinearLayoutManager) {
                ((LinearLayoutManager) npVar2).scrollToPositionWithOffset(i2, 0);
            } else {
                f(i2);
            }
        }
    }

    public final void e(int i, int i2) {
        RecyclerView recyclerViewA = a();
        if (recyclerViewA != null) {
            recyclerViewA.aA(i, i2, false);
        }
    }

    public final void f(int i) {
        ftl ftlVar = this.a;
        if (ftlVar != null) {
            ftlVar.l.ab(i);
        }
    }
}
