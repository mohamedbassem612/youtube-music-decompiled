package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jfs implements View.OnTouchListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jfs(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23, types: [aeal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [adma, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [adma, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [adma, java.lang.Object] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.$cid;
        if (i == 0) {
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            ?? r5 = this.a;
            if (((jfu) r5).f() == 0) {
                return false;
            }
            ((jas) this.b).N(r5);
            return false;
        }
        if (i == 1) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            Object obj = this.b;
            Object obj2 = this.a;
            view.performClick();
            ((View) obj).findViewById(R.id.edit_metadata_layout).requestFocus();
            EditText editText = ((gti) obj2).f;
            if (editText == null) {
                return false;
            }
            tuk.i(editText);
            return false;
        }
        if (i == 2) {
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            ?? r6 = this.a;
            if (((jfv) r6).f() == 0) {
                return false;
            }
            ((jas) this.b).N(r6);
            return false;
        }
        if (i == 3) {
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            Object obj3 = this.b;
            ?? r4 = this.a;
            ((jas) obj3).N(r4);
            jgs jgsVar = (jgs) r4;
            jgsVar.g = true;
            jgsVar.h.kk(Boolean.TRUE);
            return false;
        }
        if (i == 4) {
            View viewFindViewById = ((jqr) this.a).f.findViewById(R.id.mini_player_metadata);
            if (viewFindViewById == null) {
                return false;
            }
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            ((jqq) this.b).t.getLocationOnScreen(iArr);
            viewFindViewById.getLocationOnScreen(iArr2);
            motionEvent.offsetLocation(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            return viewFindViewById.dispatchTouchEvent(motionEvent);
        }
        if (i != 5) {
            if (!((aeaj) this.b).e) {
                return false;
            }
            this.a.a();
            return false;
        }
        View viewFindViewById2 = ((jqv) this.a).h.findViewById(R.id.watch_fragment);
        if (viewFindViewById2 == null) {
            return false;
        }
        int[] iArr3 = new int[2];
        int[] iArr4 = new int[2];
        ((jqt) this.b).t.getLocationOnScreen(iArr3);
        viewFindViewById2.getLocationOnScreen(iArr4);
        motionEvent.offsetLocation(iArr4[0] - iArr3[0], iArr4[1] - iArr3[1]);
        return viewFindViewById2.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ jfs(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
