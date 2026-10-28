package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hgg {
    public static final anaf a = b(false, 0);
    public static final anaf b = b(true, 1);
    public static final anaf c = b(true, 3);
    public static final anaf d = b(true, 4);
    public static final anaf e = b(false, 2);
    public static final anaf f = b(false, 11);

    static {
        b(false, 9);
    }

    public static String a(Context context, int i) {
        if (i == 1) {
            return context.getString(R.string.track_unplayable_reason_unknown);
        }
        if (i != 2) {
            if (i == 3) {
                return context.getString(R.string.no_user_media_browse);
            }
            if (i == 4) {
                return context.getString(R.string.free_user_media_browse);
            }
            if (i != 9 && i != 11) {
                return context.getString(R.string.music_error_generic);
            }
        }
        return context.getString(R.string.media_session_error_not_supported);
    }

    private static anaf b(boolean z, int i) {
        aihf aihfVarCreateBuilder = anaf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anaf anafVar = (anaf) aihfVarCreateBuilder.instance;
        anafVar.b |= 1;
        anafVar.c = z;
        aihfVarCreateBuilder.copyOnWrite();
        anaf anafVar2 = (anaf) aihfVarCreateBuilder.instance;
        anafVar2.b |= 2;
        anafVar2.d = i;
        return (anaf) aihfVarCreateBuilder.build();
    }
}
