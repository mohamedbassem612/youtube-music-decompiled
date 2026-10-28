package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface kou {
    Activity a();

    kot b(String str, Class cls);

    void c(String str, kot kotVar);

    void startActivityForResult(Intent intent, int i);

    void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);
}
