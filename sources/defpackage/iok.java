package defpackage;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iok implements dkn {
    protected final TwoStatePreference a;
    protected final apqs b;
    protected final iol c;
    final zza d = new gtg(this, 5);
    public boolean e;
    public boolean f;
    protected final aciz g;

    public iok(TwoStatePreference twoStatePreference, iol iolVar, aciz acizVar, apqs apqsVar) {
        this.a = twoStatePreference;
        this.b = apqsVar;
        this.c = iolVar;
        this.g = acizVar;
    }

    private final void c(boolean z, akdd akddVar) {
        ajwo ajwoVar = akddVar.r;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akyq.a);
        ajwoVar.c(aihlVarCheckIsLite);
        boolean zN = ajwoVar.j.n(aihlVarCheckIsLite.d);
        this.e = !zN;
        iol iolVar = this.c;
        acwl.i(iolVar.d, akddVar, iolVar.e, iolVar.f, null, true, true, new ioj(this, z), !zN ? Boolean.valueOf(z) : this.d, null, null, null, false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    @Override // defpackage.dkn
    public final boolean a(Preference preference, Object obj) {
        HashMap map;
        ajwo ajwoVar;
        alay alayVar;
        ajwo ajwoVar2;
        alay alayVar2;
        TwoStatePreference twoStatePreference = this.a;
        if (preference != twoStatePreference) {
            throw new IllegalArgumentException("SwitchPreferenceChangeListener must be attached to the same SwitchPreference as was used for construction.");
        }
        Boolean bool = (Boolean) obj;
        if (twoStatePreference.a == bool.booleanValue()) {
            return true;
        }
        iol iolVar = this.c;
        ijt ijtVar = iolVar.b;
        apqs apqsVar = this.b;
        aekf.d(apqsVar);
        boolean zBooleanValue = bool.booleanValue();
        if (zBooleanValue) {
            if ((apqsVar.b & 262144) != 0) {
                apqx apqxVar = apqsVar.l;
                if (apqxVar == null) {
                    apqxVar = apqx.a;
                }
                c(true, apqxVar.b == 64099105 ? (akdd) apqxVar.c : akdd.a);
                return false;
            }
            map = new HashMap();
            map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            if (zBooleanValue) {
                vxe vxeVar = iolVar.e;
                ajwoVar2 = apqsVar.h;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar.c(ajwoVar2, map);
                if ((apqsVar.b & 64) != 0) {
                    alayVar2 = apqsVar.e;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                preference.n(ackj.k(null, alayVar2, null, false));
            } else {
                vxe vxeVar2 = iolVar.e;
                ajwoVar = apqsVar.i;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar2.c(ajwoVar, map);
                if ((apqsVar.b & 16384) != 0) {
                    alayVar = apqsVar.j;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    preference.n(ackj.k(null, alayVar, null, false));
                }
            }
            this.g.z(apqsVar, zBooleanValue);
            return true;
        }
        if ((apqsVar.b & 524288) != 0) {
            apqx apqxVar2 = apqsVar.m;
            if (apqxVar2 == null) {
                apqxVar2 = apqx.a;
            }
            c(false, apqxVar2.b == 64099105 ? (akdd) apqxVar2.c : akdd.a);
            return false;
        }
        map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        if (zBooleanValue) {
            vxe vxeVar3 = iolVar.e;
            ajwoVar2 = apqsVar.h;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar3.c(ajwoVar2, map);
            if ((apqsVar.b & 64) != 0) {
                alayVar2 = apqsVar.e;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            preference.n(ackj.k(null, alayVar2, null, false));
        } else {
            vxe vxeVar4 = iolVar.e;
            ajwoVar = apqsVar.i;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar4.c(ajwoVar, map);
            if ((apqsVar.b & 16384) != 0) {
                alayVar = apqsVar.j;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                preference.n(ackj.k(null, alayVar, null, false));
            }
        }
        this.g.z(apqsVar, zBooleanValue);
        return true;
    }

    public final void b(boolean z) {
        alay alayVar;
        apqs apqsVar = this.b;
        if ((apqsVar.b & 64) != 0) {
            alayVar = apqsVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        TwoStatePreference twoStatePreference = this.a;
        twoStatePreference.n(ackj.k(null, alayVar, null, false));
        this.g.z(apqsVar, z);
        twoStatePreference.k(z);
    }
}
