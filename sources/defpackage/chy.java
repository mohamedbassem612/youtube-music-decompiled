package defpackage;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class chy implements crr {
    @Override // defpackage.crr
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        return Long.valueOf(bwp.A(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}
