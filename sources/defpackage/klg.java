package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class klg implements loo {
    private final /* synthetic */ int $cid;

    public /* synthetic */ klg(int i) {
        this.$cid = i;
    }

    @Override // defpackage.loo
    public final Object a(lpa lpaVar) throws IOException {
        int i = this.$cid;
        if (i == 0) {
            Executor executor = kli.a;
            Intent intent = (Intent) ((Bundle) lpaVar.f()).getParcelable("notification_data");
            if (intent != null) {
                return new kkr(intent);
            }
            return null;
        }
        if (i == 1) {
            Executor executor2 = kli.a;
            if (lpaVar.j()) {
                return (Bundle) lpaVar.f();
            }
            throw new IOException("SERVICE_NOT_AVAILABLE", lpaVar.e());
        }
        if (i != 2) {
            Bundle bundle = (Bundle) lpaVar.g(IOException.class);
            if (bundle == null) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle.toString()), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        Bundle bundle2 = (Bundle) lpaVar.g(IOException.class);
        if (bundle2 == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string4 = bundle2.getString("registration_id");
        if (string4 != null) {
            return string4;
        }
        String string5 = bundle2.getString("unregistered");
        if (string5 != null) {
            return string5;
        }
        String string6 = bundle2.getString("error");
        if ("RST".equals(string6)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string6 != null) {
            throw new IOException(string6);
        }
        Log.w("FirebaseInstanceId", "Unexpected response: ".concat(bundle2.toString()), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
