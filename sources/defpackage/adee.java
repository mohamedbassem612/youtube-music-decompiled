package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adee implements otc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ NodeViewInterface a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public adee(adef adefVar, aedc aedcVar, NodeViewInterface nodeViewInterface, int i) {
        this.$cid = i;
        this.b = aedcVar;
        this.a = nodeViewInterface;
        this.c = adefVar;
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, orq] */
    @Override // defpackage.otc
    public final boolean a(View view, MotionEvent motionEvent) {
        if (this.$cid != 0) {
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            Object obj = this.a;
            orn.c((View) obj, (atbf) this.b, this.c);
        } else if (motionEvent.getActionMasked() == 0) {
            Object obj2 = this.c;
            long jUptimeMillis = SystemClock.uptimeMillis();
            adef adefVar = (adef) obj2;
            adefVar.a = jUptimeMillis;
            ((aedc) this.b).onTouch((View) this.a, adefVar.c(jUptimeMillis, 0, new nxg(motionEvent.getX(), motionEvent.getY())));
        } else if (motionEvent.getActionMasked() == 1) {
            Object obj3 = this.b;
            aedc aedcVar = (aedc) obj3;
            aedcVar.onTouch((View) this.a, ((adef) this.c).c(SystemClock.uptimeMillis(), 1, new nxg(motionEvent.getX(), motionEvent.getY())));
        } else {
            if (motionEvent.getActionMasked() != 3) {
                return false;
            }
            Object obj4 = this.b;
            aedc aedcVar2 = (aedc) obj4;
            aedcVar2.onTouch((View) this.a, ((adef) this.c).c(SystemClock.uptimeMillis(), 3, new nxg(0.0f, 0.0f)));
        }
        return true;
    }

    public adee(NodeViewInterface nodeViewInterface, atbf atbfVar, orq orqVar, int i) {
        this.$cid = i;
        this.a = nodeViewInterface;
        this.b = atbfVar;
        this.c = orqVar;
    }
}
