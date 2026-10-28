package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaba implements aabo {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/notification/push/util/ActionsNotificationDecorator");
    private final Context b;
    private final aode c;
    private final Intent d;
    private final Intent e;
    private final agev f;

    public aaba(Context context, vyo vyoVar, agev agevVar, Intent intent, Intent intent2) {
        this.b = context;
        this.f = agevVar;
        this.d = intent;
        this.e = intent2;
        this.c = aabu.a(vyoVar);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [aduv, java.lang.Object] */
    private final void b(avne avneVar, avnf avnfVar, ajda ajdaVar, ajcy ajcyVar, String str, aabr aabrVar, Intent intent, xgn xgnVar, atr atrVar) {
        int iA;
        alay alayVar;
        try {
            Intent intent2 = new Intent(intent);
            aagu.p(intent2, aabrVar);
            if ((ajcyVar.b & 8) != 0) {
                ajwo ajwoVar = ajcyVar.f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aabq.b(intent2, ajwoVar);
            }
            if ((ajdaVar.b & 16384) != 0) {
                aabp.c(intent2, xgnVar.a());
                intent2.putExtra("interaction_type", 1);
            }
            if ((ajdaVar.b & 64) != 0) {
                aisd aisdVar = ajdaVar.o;
                if (aisdVar == null) {
                    aisdVar = aisd.a;
                }
                yno.V(intent2, aisdVar);
            }
            if (!str.isEmpty()) {
                aabq.h(intent2, str, this.c);
            }
            avneVar.a(ajcyVar, intent2);
            PendingIntent pendingIntent = (PendingIntent) avnfVar.a(this.b, intent2);
            if ((ajcyVar.b & 1) != 0) {
                ?? r1 = ((agfa) this.f).a;
                alja aljaVar = ajcyVar.c;
                if (aljaVar == null) {
                    aljaVar = alja.a;
                }
                aliz alizVarA = aliz.a(aljaVar.c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                iA = r1.a(alizVarA);
            } else {
                iA = 0;
            }
            if ((ajcyVar.b & 2) != 0) {
                alayVar = ajcyVar.d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            atrVar.g(new atn(iA, ackj.k(null, alayVar, null, false), pendingIntent));
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/notification/push/util/ActionsNotificationDecorator", "decorateInternal", 199, "ActionsNotificationDecorator.java")).w("Exception while creating actions: %s", e);
        }
    }

    @Override // defpackage.aabo
    public final void a(final ajda ajdaVar, final xgn xgnVar, aabr aabrVar, atr atrVar) {
        final int i = 0;
        int i2 = 0;
        for (ajcy ajcyVar : ajdaVar.k) {
            int i3 = i2 + 1;
            String str = (String) aaal.a.getOrDefault(Integer.valueOf(i2), "");
            int i4 = ajcyVar.b;
            if ((i4 & 16) != 0) {
                final int i5 = 1;
                b(new avne() { // from class: aaaz
                    @Override // defpackage.avne
                    public final void a(Object obj, Object obj2) {
                        if (i5 == 0) {
                            Intent intent = (Intent) obj2;
                            ajwo ajwoVar = ((ajcy) obj).h;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            if (ajwoVar != null) {
                                intent.putExtra("notification_opt_out_dialog_command", ajwoVar.toByteArray());
                                return;
                            }
                            return;
                        }
                        ajcy ajcyVar2 = (ajcy) obj;
                        Intent intent2 = (Intent) obj2;
                        ajwo ajwoVar2 = ajcyVar2.g;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        aagu.q(intent2, ajwoVar2);
                        amud amudVar = ajcyVar2.i;
                        if (amudVar == null) {
                            amudVar = amud.b;
                        }
                        aabq.e(intent2, amudVar);
                    }
                }, new jnx(17), ajdaVar, ajcyVar, str, aabrVar, this.d, xgnVar, atrVar);
            } else if ((i4 & 32) != 0) {
                b(new avne() { // from class: aaaz
                    @Override // defpackage.avne
                    public final void a(Object obj, Object obj2) {
                        if (i == 0) {
                            Intent intent = (Intent) obj2;
                            ajwo ajwoVar = ((ajcy) obj).h;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            if (ajwoVar != null) {
                                intent.putExtra("notification_opt_out_dialog_command", ajwoVar.toByteArray());
                                return;
                            }
                            return;
                        }
                        ajcy ajcyVar2 = (ajcy) obj;
                        Intent intent2 = (Intent) obj2;
                        ajwo ajwoVar2 = ajcyVar2.g;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        aagu.q(intent2, ajwoVar2);
                        amud amudVar = ajcyVar2.i;
                        if (amudVar == null) {
                            amudVar = amud.b;
                        }
                        aabq.e(intent2, amudVar);
                    }
                }, new jnx(16), ajdaVar, ajcyVar, str, aabrVar, null, xgnVar, atrVar);
            } else if ((i4 & 4) != 0) {
                b(new avne() { // from class: aaay
                    @Override // defpackage.avne
                    public final void a(Object obj, Object obj2) {
                        Intent intent = (Intent) obj2;
                        ajwo ajwoVar = ((ajcy) obj).e;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        zik.bd(intent, ajwoVar, xgnVar, (ajdaVar.b & 16384) != 0);
                    }
                }, new jnx(16), ajdaVar, ajcyVar, str, aabrVar, this.e, xgnVar, atrVar);
            }
            i2 = i3;
        }
    }
}
