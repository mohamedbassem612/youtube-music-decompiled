package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ruo implements zzi {
    final /* synthetic */ Map a;

    public ruo(Map map) {
        this.a = map;
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        return (String) this.a.get(str);
    }

    @Override // defpackage.zzi
    public final String b() {
        return "";
    }
}
