package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nsv {
    public static Uri a(Context context, Uri uri) throws IOException {
        try {
            String str = Os.readlink(new omj((Object) context, (byte[]) null).V(uri).getAbsolutePath());
            if (str == null) {
                throw new IOException("Unable to read symlink");
            }
            Pattern pattern = qpr.a;
            qpq qpqVar = new qpq(context);
            qpqVar.b(str);
            return qpqVar.a();
        } catch (ErrnoException | qqb e) {
            throw new IOException("Unable to read symlink", e);
        }
    }

    public static void b(Context context, Uri uri, Uri uri2) throws IOException {
        try {
            omj omjVar = new omj((Object) context, (byte[]) null);
            Os.symlink(omjVar.V(uri2).getAbsolutePath(), omjVar.V(uri).getAbsolutePath());
        } catch (ErrnoException | qqb e) {
            throw new IOException("Unable to create symlink", e);
        }
    }
}
