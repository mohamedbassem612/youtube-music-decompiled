package defpackage;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fnw extends ColorDrawable implements fnx {
    @Override // defpackage.fnx
    public final boolean b(fnx fnxVar) {
        if (this != fnxVar) {
            return (fnxVar instanceof fnw) && getColor() == ((fnw) fnxVar).getColor();
        }
        return true;
    }
}
