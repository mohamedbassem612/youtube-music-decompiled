package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kcy implements kcs {
    final /* synthetic */ kda a;

    public kcy(kda kdaVar) {
        this.a = kdaVar;
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void a(kcq kcqVar, int i) {
        kda kdaVar = this.a;
        kdaVar.g = (kbu) kcqVar;
        kdaVar.e(i);
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void b(kcq kcqVar) {
        this.a.g = (kbu) kcqVar;
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void c(kcq kcqVar, int i) {
        kda kdaVar = this.a;
        kdaVar.g = (kbu) kcqVar;
        kdaVar.e(i);
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void d(kcq kcqVar, boolean z) {
        khn khnVar = kda.a;
        khn.e();
        kda kdaVar = this.a;
        kdaVar.g = (kbu) kcqVar;
        kdaVar.c();
        kro.l(kdaVar.f);
        aihf aihfVarC = kdaVar.d.c(kdaVar.f);
        kdc.d(aihfVarC, z);
        kdaVar.b.a((agzp) aihfVarC.build(), 227);
        kdaVar.f();
        kdaVar.g();
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void e(kcq kcqVar, String str) {
        khn khnVar = kda.a;
        khn.e();
        kda kdaVar = this.a;
        kdaVar.g = (kbu) kcqVar;
        if (kdaVar.h(str)) {
            khn.e();
            kro.l(kdaVar.f);
        } else {
            SharedPreferences sharedPreferences = kdaVar.e;
            kdl kdlVar = kdaVar.c;
            long j = kdb.a;
            kdb kdbVar = null;
            boolean z = false;
            if (sharedPreferences != null) {
                kdb kdbVar2 = new kdb(kdlVar);
                kdbVar2.p = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    kdbVar2.c = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        kdbVar2.d = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            kdbVar2.e = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                kdbVar2.f = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    kdbVar2.g = sharedPreferences.getString("receiver_session_id", "");
                                    kdbVar2.h = sharedPreferences.getInt("device_capabilities", 0);
                                    kdbVar2.i = sharedPreferences.getString("device_model_name", "");
                                    kdbVar2.j = sharedPreferences.getString("manufacturer", "");
                                    kdbVar2.k = sharedPreferences.getString("product_name", "");
                                    kdbVar2.l = sharedPreferences.getString("build_type", "");
                                    kdbVar2.m = sharedPreferences.getString("cast_build_version", "");
                                    kdbVar2.n = sharedPreferences.getString("system_build_number", "");
                                    kdbVar2.o = sharedPreferences.getInt("device_category", 0);
                                    kdbVar2.q = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    kdbVar = kdbVar2;
                                }
                            }
                        }
                    }
                }
            }
            kdaVar.f = kdbVar;
            if (kdaVar.h(str)) {
                khn.e();
                kro.l(kdaVar.f);
                kdb.a = kdaVar.f.e + 1;
            } else {
                khn.e();
                kdaVar.f = kdb.a(kdlVar);
                kdb kdbVar3 = kdaVar.f;
                kro.l(kdbVar3);
                kbu kbuVar = kdaVar.g;
                if (kbuVar != null && kbuVar.k()) {
                    z = true;
                }
                kdbVar3.p = z;
                kdb kdbVar4 = kdaVar.f;
                kro.l(kdbVar4);
                kdbVar4.c = kda.a();
                kdb kdbVar5 = kdaVar.f;
                kro.l(kdbVar5);
                kdbVar5.g = str;
            }
        }
        kro.l(kdaVar.f);
        aihf aihfVarC = kdaVar.d.c(kdaVar.f);
        agzo agzoVar = ((agzp) aihfVarC.instance).k;
        if (agzoVar == null) {
            agzoVar = agzo.a;
        }
        aihf aihfVarCreateBuilder = agzo.a.createBuilder(agzoVar);
        aihfVarCreateBuilder.copyOnWrite();
        agzo agzoVar2 = (agzo) aihfVarCreateBuilder.instance;
        agzoVar2.b |= 64;
        agzoVar2.f = 10;
        agzo agzoVar3 = (agzo) aihfVarCreateBuilder.build();
        aihfVarC.copyOnWrite();
        agzp agzpVar = (agzp) aihfVarC.instance;
        agzoVar3.getClass();
        agzpVar.k = agzoVar3;
        agzpVar.c |= 4;
        kdc.d(aihfVarC, true);
        kdaVar.b.a((agzp) aihfVarC.build(), 226);
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void f(kcq kcqVar, int i) {
        kda kdaVar = this.a;
        kdaVar.g = (kbu) kcqVar;
        kdaVar.e(i);
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void g(kcq kcqVar, String str) {
        khn khnVar = kda.a;
        khn.e();
        kda kdaVar = this.a;
        kdaVar.g = (kbu) kcqVar;
        kdaVar.c();
        kdb kdbVar = kdaVar.f;
        kdbVar.g = str;
        kdaVar.b.a(kdaVar.d.a(kdbVar), 222);
        kdaVar.f();
        kdaVar.g();
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void h(kcq kcqVar) {
        khn khnVar = kda.a;
        khn.e();
        kda kdaVar = this.a;
        kdaVar.g = (kbu) kcqVar;
        if (kdaVar.f != null) {
            khnVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        kdaVar.d();
        kdc kdcVar = kdaVar.d;
        kdb kdbVar = kdaVar.f;
        aihf aihfVarC = kdcVar.c(kdbVar);
        if (kdbVar.q == 1) {
            agzo agzoVar = ((agzp) aihfVarC.instance).k;
            if (agzoVar == null) {
                agzoVar = agzo.a;
            }
            aihf aihfVarCreateBuilder = agzo.a.createBuilder(agzoVar);
            aihfVarCreateBuilder.copyOnWrite();
            agzo agzoVar2 = (agzo) aihfVarCreateBuilder.instance;
            agzoVar2.b |= 64;
            agzoVar2.f = 17;
            agzo agzoVar3 = (agzo) aihfVarCreateBuilder.build();
            aihfVarC.copyOnWrite();
            agzp agzpVar = (agzp) aihfVarC.instance;
            agzoVar3.getClass();
            agzpVar.k = agzoVar3;
            agzpVar.c |= 4;
        }
        kdaVar.b.a((agzp) aihfVarC.build(), 221);
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void i(kcq kcqVar, int i) {
        khn khnVar = kda.a;
        khn.e();
        kda kdaVar = this.a;
        kdaVar.g = (kbu) kcqVar;
        kdaVar.c();
        kro.l(kdaVar.f);
        kdaVar.b.a(kdaVar.d.b(kdaVar.f, i), 225);
        kdaVar.f();
        kdaVar.b();
    }
}
