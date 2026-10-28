package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bcm extends InputConnectionWrapper {
    final /* synthetic */ bcn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcm(InputConnection inputConnection, bcn bcnVar) {
        super(inputConnection, false);
        this.a = bcnVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.a.a(inputContentInfo != null ? new zs(new bcp(inputContentInfo), (byte[]) null) : null, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
