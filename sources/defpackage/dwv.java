package defpackage;

import android.graphics.Typeface;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dwv implements axo {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ dwv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awyp, java.lang.Object] */
    @Override // defpackage.axo
    public final void accept(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            this.a.j((dwy) obj);
            return;
        }
        if (i == 1) {
            super/*android.widget.EditText*/.setTypeface((Typeface) obj);
        } else if (i == 2) {
            ((eoa) this.a).w((eoh) obj);
        } else if (i != 3) {
            ((yqo) this.a).h((PlatypusException) obj);
        } else {
            ((yqo) this.a).h((Exception) obj);
        }
    }
}
