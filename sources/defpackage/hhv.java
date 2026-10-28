package defpackage;

import android.accounts.Account;
import j$.time.Duration;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hhv implements IntFunction {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hhv(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.$cid) {
            case 0:
                Duration duration = hia.a;
                return new avmn[i];
            case 1:
                Duration duration2 = hia.a;
                return new avmn[i];
            case 2:
                int i2 = hoe.d;
                return new String[i];
            case 3:
                int i3 = hoe.d;
                return new String[i];
            case 4:
                return new String[i];
            case 5:
                return new String[i];
            case 6:
                return new avmn[i];
            case 7:
                return new StackTraceElement[i];
            case 8:
                return new StackTraceElement[i];
            case 9:
                return new Account[i];
            case 10:
                return new wiw[i];
            case 11:
                agkz agkzVar = yos.a;
                return new wiw[i];
            case 12:
                return new bse[i];
            case 13:
                return new bse[i];
            case 14:
                return new bse[i];
            default:
                return new wgo[i];
        }
    }
}
