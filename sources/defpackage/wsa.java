package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wsa extends wlu {
    private final List D;
    public String a;
    public String b;
    public String c;
    public int d;
    private String e;

    protected wsa(abxv abxvVar, zwa zwaVar) {
        super("playlist/create", abxvVar, zwaVar, 1, true, null, null);
        this.d = 1;
        this.D = new ArrayList();
    }

    public final void F(String str) {
        this.e = j(str);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alwh.a.createBuilder();
        String str = this.e;
        aihfVarCreateBuilder.copyOnWrite();
        alwh alwhVar = (alwh) aihfVarCreateBuilder.instance;
        str.getClass();
        alwhVar.b |= 4;
        alwhVar.d = str;
        if (!TextUtils.isEmpty(this.a)) {
            String str2 = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            alwh alwhVar2 = (alwh) aihfVarCreateBuilder.instance;
            str2.getClass();
            alwhVar2.b |= 32;
            alwhVar2.h = str2;
        }
        List list = this.D;
        if (!list.isEmpty() && TextUtils.isEmpty(this.b)) {
            aihfVarCreateBuilder.copyOnWrite();
            alwh alwhVar3 = (alwh) aihfVarCreateBuilder.instance;
            aiie aiieVar = alwhVar3.e;
            if (!aiieVar.c()) {
                alwhVar3.e = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, alwhVar3.e);
        } else if (list.isEmpty() && !TextUtils.isEmpty(this.b)) {
            String str3 = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            alwh alwhVar4 = (alwh) aihfVarCreateBuilder.instance;
            str3.getClass();
            alwhVar4.b |= 8;
            alwhVar4.f = str3;
        }
        int i = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        alwh alwhVar5 = (alwh) aihfVarCreateBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        alwhVar5.g = i2;
        alwhVar5.b |= 16;
        String str4 = this.c;
        if (str4 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alwh alwhVar6 = (alwh) aihfVarCreateBuilder.instance;
            alwhVar6.b |= 64;
            alwhVar6.i = str4;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        boolean z = true;
        if (!this.D.isEmpty() && !TextUtils.isEmpty(this.b)) {
            z = false;
        }
        ahno.P(z, "CreatePlaylistServiceRequest can only have videoIds or sourcePlaylistId");
    }

    public final void e(String str) {
        this.D.add(str);
    }
}
