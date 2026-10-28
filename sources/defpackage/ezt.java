package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezt implements eub {
    private final ewn a;
    private final eub b;

    public ezt(ewn ewnVar, eub eubVar) {
        this.a = ewnVar;
        this.b = eubVar;
    }

    @Override // defpackage.eth
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, ety etyVar) {
        return this.b.a(new ezw(((BitmapDrawable) ((ewf) obj).c()).getBitmap(), this.a), file, etyVar);
    }

    @Override // defpackage.eub
    public final int b() {
        return 2;
    }
}
