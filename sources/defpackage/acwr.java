package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class acwr extends fu {
    private final boolean b;
    private final boolean c;

    public acwr(Context context, boolean z, boolean z2, byte[] bArr) {
        super(context, R.style.Theme_YouTube_ElementsDialogFullScreen);
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.fu
    public final fv create() {
        fv fvVarCreate = super.create();
        boolean z = this.b;
        if (z || this.c) {
            fvVarCreate.create();
            if (z) {
                abfv.h(fvVarCreate.b(-1));
                abfv.h(fvVarCreate.b(-2));
                abfv.h(fvVarCreate.b(-3));
            }
            if (this.c) {
                abfv.i(fvVarCreate.getWindow(), fvVarCreate.getContext());
            }
        }
        return fvVarCreate;
    }

    @Override // defpackage.fu
    public final void j() {
        if (this.b) {
            create().show();
        } else {
            create().show();
        }
    }

    public acwr(Context context, boolean z, boolean z2) {
        super(context);
        this.b = z;
        this.c = z2;
    }
}
