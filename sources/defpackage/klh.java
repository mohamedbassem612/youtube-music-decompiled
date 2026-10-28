package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import j$.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class klh extends afkg {
    final /* synthetic */ kli a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klh(kli kliVar, Looper looper) {
        super(looper, (byte[]) null);
        this.a = kliVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("Rpc", "Dropping invalid message");
            return;
        }
        kli kliVar = this.a;
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new kkt());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof kku) {
                kliVar.g = (kku) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                kliVar.f = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        if (Objects.equals(intent2.getAction(), "com.google.android.c2dm.intent.REGISTRATION")) {
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra != null) {
                Matcher matcher = kli.b.matcher(stringExtra);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        kliVar.c(strGroup, extras);
                        return;
                    }
                    return;
                }
                return;
            }
            String stringExtra2 = intent2.getStringExtra("error");
            if (stringExtra2 == null) {
                Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras()))));
                return;
            }
            if (!stringExtra2.startsWith("|")) {
                aha ahaVar = kliVar.c;
                synchronized (ahaVar) {
                    for (int i = 0; i < ahaVar.d; i++) {
                        kliVar.c((String) ahaVar.d(i), intent2.getExtras());
                    }
                }
                return;
            }
            String[] strArrSplit = stringExtra2.split("\\|");
            if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                return;
            }
            String str = strArrSplit[2];
            String strSubstring = strArrSplit[3];
            if (strSubstring.startsWith(":")) {
                strSubstring = strSubstring.substring(1);
            }
            kliVar.c(str, intent2.putExtra("error", strSubstring).getExtras());
        }
    }
}
