package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.EnumMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gqr implements aduv {
    private volatile EnumMap a = new EnumMap(aliz.class);

    public gqr() {
        b(aliz.PLAY_ALL, R.drawable.ic_shortcut_play);
        b(aliz.SEARCH, R.drawable.ic_shortcut_search);
        b(aliz.SHUFFLE, R.drawable.ic_shortcut_shuffle);
        b(aliz.BROADCAST, R.drawable.ic_shortcut_podcasts);
    }

    private final void b(aliz alizVar, int i) {
        this.a.put(alizVar, Integer.valueOf(i));
    }

    @Override // defpackage.aduv
    public final int a(aliz alizVar) {
        Integer num = (Integer) this.a.get(alizVar);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
