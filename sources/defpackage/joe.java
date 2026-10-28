package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joe {
    public final alay a;
    public final String b;

    public joe(alay alayVar, String str) {
        if (alayVar == null) {
            throw new NullPointerException("Null title");
        }
        this.a = alayVar;
        if (str == null) {
            throw new NullPointerException("Null subtitle");
        }
        this.b = str;
    }

    public static joe a(Context context, xzc xzcVar, View view, View view2, String str, String str2) {
        joe joeVar;
        if (xzcVar == null) {
            return new joe(ixt.k(view, agke.q(b(context, str, R.color.ytm_color_white, 3))), str2);
        }
        Resources resources = view2.getResources();
        int iB = xzcVar.b();
        if (iB == 0) {
            joeVar = new joe(ixt.k(view, agke.s(b(context, str, R.color.ytm_color_white, 3), b(context, " • ", R.color.ytm_text_color_secondary_translucent, 12), b(context, str2, R.color.ytm_text_color_secondary_translucent, 12))), resources.getString(R.string.mini_player_mdx_connecting, xzcVar.n().d));
        } else {
            if (iB != 1) {
                return new joe(ixt.k(view, agke.q(b(context, str, R.color.ytm_color_white, 3))), str2);
            }
            joeVar = new joe(ixt.k(view, agke.s(b(context, str, R.color.ytm_color_white, 3), b(context, " • ", R.color.ytm_text_color_secondary_translucent, 12), b(context, str2, R.color.ytm_text_color_secondary_translucent, 12))), resources.getString(R.string.mini_player_mdx_playing, xzcVar.n().d));
        }
        return joeVar;
    }

    private static alba b(Context context, String str, int i, int i2) {
        aihh aihhVar = (aihh) alba.a.createBuilder();
        int i3 = typ.a;
        aihhVar.copyOnWrite();
        alba albaVar = (alba) aihhVar.instance;
        albaVar.b |= 1;
        albaVar.c = typ.c(str);
        aihhVar.copyOnWrite();
        alba albaVar2 = (alba) aihhVar.instance;
        albaVar2.k = i2 - 1;
        albaVar2.b |= SemanticState.ReadOnly;
        int color = context.getColor(i);
        aihhVar.copyOnWrite();
        alba albaVar3 = (alba) aihhVar.instance;
        albaVar3.b |= SemanticState.Hidden;
        albaVar3.i = color;
        return (alba) aihhVar.build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof joe) {
            joe joeVar = (joe) obj;
            if (this.a.equals(joeVar.a) && this.b.equals(joeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MiniPlayerMetadataModel{title=" + this.a.toString() + ", subtitle=" + this.b + '}';
    }

    public joe() {
        throw null;
    }
}
