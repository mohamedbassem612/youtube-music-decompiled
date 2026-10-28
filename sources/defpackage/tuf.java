package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tuf implements avlt {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tuf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.avlt
    public final void a(avls avlsVar) {
        int i = this.$cid;
        int i2 = 7;
        if (i == 0) {
            jfx jfxVar = new jfx(avlsVar, 7);
            Object obj = this.a;
            avlsVar.d(new tuh(obj, jfxVar, 0));
            if (!avlsVar.f()) {
                View view = (View) obj;
                avlsVar.c(new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()));
            }
            ((View) obj).addOnLayoutChangeListener(jfxVar);
            return;
        }
        int i3 = 1;
        if (i == 1) {
            hom homVar = new hom(avlsVar);
            Object obj2 = this.a;
            ((jnm) ((hoo) obj2).h.io()).y(homVar);
            avlsVar.d(new tuh(obj2, homVar, i3));
            return;
        }
        if (i == 2) {
            awbk awbkVar = new awbk(avlsVar);
            Object obj3 = this.a;
            yqo yqoVar = (yqo) obj3;
            yqoVar.m = awbkVar;
            yqoVar.m.e(new avml(new vtu(obj3, 6)));
            yqoVar.i();
            return;
        }
        if (i == 3) {
            awbk awbkVar2 = new awbk(avlsVar);
            Object obj4 = this.a;
            yqo yqoVar2 = (yqo) obj4;
            yqoVar2.m = awbkVar2;
            yqoVar2.m.e(new avml(new vtu(obj4, i2)));
            yqoVar2.i();
            return;
        }
        Object obj5 = this.a;
        if (i != 4) {
            if (((AtomicBoolean) obj5).get()) {
                avlsVar.a();
                return;
            } else {
                avlsVar.b(new NoSuchElementException("Stream completed without completing substream."));
                return;
            }
        }
        if (((AtomicBoolean) obj5).get()) {
            avlsVar.a();
        } else {
            avlsVar.b(new NoSuchElementException("Stream completed without completing substream."));
        }
    }
}
