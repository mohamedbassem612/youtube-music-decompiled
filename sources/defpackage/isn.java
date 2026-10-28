package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class isn implements jkt {
    private final Context a;
    private final Map b;
    private final boolean c;

    public isn(Context context, Map map, boolean z) {
        this.a = context;
        this.b = map;
        this.c = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jkt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String string = "";
        String strValueOf = string;
        long j = 0;
        int i = 0;
        String strValueOf2 = strValueOf;
        String strZ = strValueOf2;
        for (String str : obj.getColumnNames()) {
            switch (str.hashCode()) {
                case -1992012396:
                    if (!str.equals("duration")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    String string2 = obj.getString(obj.getColumnIndex(str));
                    if (!TextUtils.isEmpty(string2)) {
                        j = Long.parseLong(string2);
                        continue;
                    }
                    break;
                    break;
                case -1409097913:
                    if (!str.equals("artist")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    string = obj.getString(obj.getColumnIndex(str));
                    if (string == null || TextUtils.equals(string, "<unknown>")) {
                        string = this.a.getString(R.string.unknown_artist);
                    } else {
                        continue;
                    }
                    break;
                    break;
                case 94650:
                    if (!str.equals("_id")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    break;
                case 110371416:
                    if (!str.equals("title")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    strZ = ahno.Z(obj.getString(obj.getColumnIndex(str)));
                    continue;
                    break;
                    break;
                case 110621003:
                    if (!str.equals("track")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    i = obj.getInt(obj.getColumnIndex(str)) % 1000;
                    continue;
                    break;
                    break;
                case 975912484:
                    if (!str.equals("audio_id")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    break;
                case 1532078315:
                    if (!str.equals("album_id")) {
                        throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
                    }
                    strValueOf = String.valueOf(obj.getLong(obj.getColumnIndex(str)));
                    continue;
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected column: ".concat(String.valueOf(str)));
            }
            strValueOf2 = String.valueOf(obj.getLong(obj.getColumnIndex(str)));
        }
        aihf aihfVarCreateBuilder = anzd.a.createBuilder();
        String strAF = kro.aF(strValueOf2);
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar = (anzd) aihfVarCreateBuilder.instance;
        strAF.getClass();
        anzdVar.b |= 1;
        anzdVar.c = strAF;
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar2 = (anzd) aihfVarCreateBuilder.instance;
        anzdVar2.b |= 4;
        anzdVar2.e = strZ;
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar3 = (anzd) aihfVarCreateBuilder.instance;
        string.getClass();
        anzdVar3.b |= 32;
        anzdVar3.i = string;
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar4 = (anzd) aihfVarCreateBuilder.instance;
        anzdVar4.b |= 131072;
        anzdVar4.u = j;
        String string3 = ixt.p(strValueOf2).toString();
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar5 = (anzd) aihfVarCreateBuilder.instance;
        string3.getClass();
        anzdVar5.b |= 32768;
        anzdVar5.s = string3;
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar6 = (anzd) aihfVarCreateBuilder.instance;
        anzdVar6.b |= 65536;
        anzdVar6.t = i;
        String strAC = kro.aC(strValueOf);
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar7 = (anzd) aihfVarCreateBuilder.instance;
        strAC.getClass();
        anzdVar7.b |= SemanticState.Multiline;
        anzdVar7.q = strAC;
        aqmh aqmhVarW = Build.VERSION.SDK_INT >= 29 ? ixt.w(this.a, ixt.l(strValueOf2), R.drawable.empty_state_cover_square, this.c) : ixt.x(ahno.Z((String) this.b.get(strValueOf)), this.a, R.drawable.empty_state_cover_square);
        if (aqmhVarW != null) {
            aihfVarCreateBuilder.copyOnWrite();
            anzd anzdVar8 = (anzd) aihfVarCreateBuilder.instance;
            anzdVar8.g = aqmhVarW;
            anzdVar8.b |= 16;
        }
        return anyx.e((anzd) aihfVarCreateBuilder.build()).am();
    }

    public isn(Context context, wek wekVar, boolean z) {
        this(context, agpn.b, z);
    }
}
