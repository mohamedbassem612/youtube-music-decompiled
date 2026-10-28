package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wry extends wlu {
    private final List D;
    public String a;
    public Integer b;
    public String c;
    public Integer d;
    public final List e;

    public wry(abxv abxvVar, zwa zwaVar) {
        super("playlist/get_generated_thumbnails", abxvVar, zwaVar, 1, true, null, null);
        this.D = new ArrayList();
        this.e = new ArrayList();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alwf.a.createBuilder();
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alwf alwfVar = (alwf) aihfVarCreateBuilder.instance;
            alwfVar.b |= 2;
            alwfVar.d = str;
        }
        Integer num = this.b;
        if (num != null) {
            int iIntValue = num.intValue();
            aihfVarCreateBuilder.copyOnWrite();
            alwf alwfVar2 = (alwf) aihfVarCreateBuilder.instance;
            alwfVar2.b |= 8;
            alwfVar2.f = iIntValue;
        }
        List list = this.D;
        if (!list.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            alwf alwfVar3 = (alwf) aihfVarCreateBuilder.instance;
            aiie aiieVar = alwfVar3.e;
            if (!aiieVar.c()) {
                alwfVar3.e = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, alwfVar3.e);
        }
        List list2 = this.e;
        if (!list2.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            alwf alwfVar4 = (alwf) aihfVarCreateBuilder.instance;
            aihv aihvVar = alwfVar4.g;
            if (!aihvVar.c()) {
                alwfVar4.g = aihn.mutableCopy(aihvVar);
            }
            aifs.addAll(list2, alwfVar4.g);
        }
        String str2 = this.c;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alwf alwfVar5 = (alwf) aihfVarCreateBuilder.instance;
            alwfVar5.b |= 16;
            alwfVar5.h = str2;
        }
        Integer num2 = this.d;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            aihfVarCreateBuilder.copyOnWrite();
            alwf alwfVar6 = (alwf) aihfVarCreateBuilder.instance;
            alwfVar6.b |= 32;
            alwfVar6.i = iIntValue2;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.P(!TextUtils.isEmpty(this.a), "GetGeneratedThumbnailsRequest requires a playlist ID.");
    }
}
