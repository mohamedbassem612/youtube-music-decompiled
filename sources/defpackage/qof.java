package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qof {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static PendingIntent a(Context context, int i, Intent intent, int i2, int i3) {
        return PendingIntent.getBroadcast(context, i, c(intent, i2, i3), i2);
    }

    public static PendingIntent b(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, c(intent, i2, 0), i2);
    }

    private static Intent c(Intent intent, int i, int i2) {
        ahno.G((i & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        ahno.G((i & 1) == 0 || d(i2, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        ahno.G((i & 2) == 0 || d(i2, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        ahno.G((i & 4) == 0 || d(i2, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        ahno.G((i & SemanticState.Focused) == 0 || d(i2, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        ahno.G(intent.getComponent() != null, "Must set component on Intent.");
        if (d(i2, 1)) {
            ahno.G(!d(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            ahno.G(d(i, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!d(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!d(i2, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!d(i2, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!d(i2, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!d(i2, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    private static boolean d(int i, int i2) {
        return (i & i2) == i2;
    }
}
