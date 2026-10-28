package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wox extends wlu {
    public int D;
    private final zwb E;
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;

    public wox(abxv abxvVar, zwb zwbVar) {
        super("channel_edit/validate_channel_handle", abxvVar, zwbVar.e(), 1, true, null, null);
        this.E = zwbVar;
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alzj.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            alzj alzjVar = (alzj) aihfVarCreateBuilder.instance;
            str.getClass();
            alzjVar.c = 2;
            alzjVar.d = str;
        }
        if (!TextUtils.isEmpty(this.e)) {
            String str2 = this.e;
            aihfVarCreateBuilder.copyOnWrite();
            alzj alzjVar2 = (alzj) aihfVarCreateBuilder.instance;
            str2.getClass();
            alzjVar2.c = 7;
            alzjVar2.d = str2;
        }
        if (!TextUtils.isEmpty(this.b)) {
            String str3 = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            alzj alzjVar3 = (alzj) aihfVarCreateBuilder.instance;
            str3.getClass();
            alzjVar3.b |= 2;
            alzjVar3.f = str3;
        }
        if (!TextUtils.isEmpty(this.c)) {
            String str4 = this.c;
            aihfVarCreateBuilder.copyOnWrite();
            alzj alzjVar4 = (alzj) aihfVarCreateBuilder.instance;
            str4.getClass();
            alzjVar4.b |= 4;
            alzjVar4.g = str4;
        }
        boolean z = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        alzj alzjVar5 = (alzj) aihfVarCreateBuilder.instance;
        alzjVar5.b |= 8;
        alzjVar5.h = z;
        int i = this.D;
        if (i != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            alzj alzjVar6 = (alzj) aihfVarCreateBuilder.instance;
            alzjVar6.i = i - 1;
            alzjVar6.b |= 16;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    public final void b() {
        ahno.O(this.E.u());
        ahno.O((TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.e)) ? false : true);
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        ahno.O(!TextUtils.isEmpty(this.c));
    }
}
