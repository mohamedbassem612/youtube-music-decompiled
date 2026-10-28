package defpackage;

import android.content.Context;
import android.text.Spanned;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.ui.preference.PreferenceCategoryCompat;
import com.google.android.apps.youtube.music.ui.preference.SwitchCompatPreference;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iol extends aekf {
    public final Executor a;
    public final ijt b;
    public final aciz c;
    private final abww g;

    public iol(Context context, vxe vxeVar, xgn xgnVar, ijt ijtVar, aciz acizVar, zwb zwbVar, ackf ackfVar, abww abwwVar, aduv aduvVar, Executor executor) {
        super(context, vxeVar, xgnVar, ijtVar, acizVar, zwbVar, ackfVar, aduvVar);
        ijtVar.getClass();
        this.b = ijtVar;
        acizVar.getClass();
        this.c = acizVar;
        this.g = abwwVar;
        this.a = executor;
    }

    private final void e(PreferenceScreen preferenceScreen, Preference preference, apqu apquVar) {
        aiie<apru> aiieVar;
        if ((apquVar.b & 16) != 0) {
            apre apreVar = apquVar.g;
            if (apreVar == null) {
                apreVar = apre.a;
            }
            aiieVar = apreVar.g;
        } else {
            apqs apqsVar = apquVar.d;
            if (apqsVar == null) {
                apqsVar = apqs.a;
            }
            aiieVar = apqsVar.n;
        }
        for (apru apruVar : aiieVar) {
            ijt ijtVar = this.b;
            int iAX = acfz.aX(apruVar.c);
            if (iAX == 0) {
                iAX = 1;
            }
            String strC = ijtVar.c(iAX - 1);
            if (strC != null && (preferenceScreen.l(strC) instanceof TwoStatePreference)) {
                preference.K(strC);
            }
        }
    }

    public final void a(dky dkyVar, List list) {
        dlg preferenceManager = dkyVar.getPreferenceManager();
        Context context = this.d;
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.C(preferenceManager);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apqu apquVar = (apqu) it.next();
            if ((apquVar.b & 4) != 0) {
                PreferenceCategoryCompat preferenceCategoryCompat = new PreferenceCategoryCompat(context);
                apqw apqwVar = apquVar.e;
                if (apqwVar == null) {
                    apqwVar = apqw.a;
                }
                if ((apqwVar.b & 1) != 0) {
                    apqw apqwVar2 = apquVar.e;
                    if (apqwVar2 == null) {
                        apqwVar2 = apqw.a;
                    }
                    int iAW = acfz.aW(apqwVar2.e);
                    preferenceCategoryCompat.M(Integer.toString((iAW != 0 ? iAW : 1) - 1));
                }
                preferenceScreen.ah(preferenceCategoryCompat);
                apqw apqwVar3 = apquVar.e;
                if (apqwVar3 == null) {
                    apqwVar3 = apqw.a;
                }
                if ((apqwVar3.b & 2) != 0) {
                    alay alayVar = apqwVar3.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    preferenceCategoryCompat.Q(ackj.k(null, alayVar, null, false));
                }
                Iterator it2 = apqwVar3.d.iterator();
                while (it2.hasNext()) {
                    Preference preferenceB = b((apqu) it2.next());
                    if (preferenceB != null) {
                        preferenceCategoryCompat.ah(preferenceB);
                    }
                }
            } else {
                Preference preferenceB2 = b(apquVar);
                if (preferenceB2 != null) {
                    preferenceScreen.ah(preferenceB2);
                }
            }
        }
        dkyVar.setPreferenceScreen(preferenceScreen);
        for (int i = 0; i < list.size() && i < preferenceScreen.k(); i++) {
            Preference preferenceO = preferenceScreen.o(i);
            if ((((apqu) list.get(i)).b & 4) != 0) {
                PreferenceCategory preferenceCategory = (PreferenceCategory) preferenceO;
                apqw apqwVar4 = ((apqu) list.get(i)).e;
                if (apqwVar4 == null) {
                    apqwVar4 = apqw.a;
                }
                for (int i2 = 0; i2 < preferenceCategory.k(); i2++) {
                    e(preferenceScreen, preferenceCategory.o(i2), (apqu) apqwVar4.d.get(i2));
                }
            } else {
                e(preferenceScreen, preferenceO, (apqu) list.get(i));
            }
        }
    }

    public final Preference b(apqu apquVar) {
        alay alayVar;
        Preference preference;
        Spanned spannedK;
        int i = apquVar.b;
        int i2 = 1;
        int i3 = 0;
        String strC = null;
        if ((i & 2) != 0) {
            apqs apqsVar = apquVar.d;
            if (apqsVar == null) {
                apqsVar = apqs.a;
            }
            aciz acizVar = this.c;
            boolean z = acizVar.w(apqsVar).f;
            SwitchCompatPreference switchCompatPreference = new SwitchCompatPreference(this.d);
            if ((apqsVar.b & 32) != 0) {
                alay alayVar2 = apqsVar.d;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                switchCompatPreference.Q(ackj.k(null, alayVar2, null, false));
            }
            switchCompatPreference.y = Boolean.valueOf(z);
            switchCompatPreference.n = new iok(switchCompatPreference, this, acizVar, apqsVar);
            switchCompatPreference.L(!apqsVar.g);
            if (apqsVar.g && (apqsVar.b & 32768) != 0) {
                alay alayVar3 = apqsVar.k;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                spannedK = ackj.k(null, alayVar3, null, false);
            } else if (z || (apqsVar.b & 16384) == 0) {
                alay alayVar4 = apqsVar.e;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
                spannedK = ackj.k(null, alayVar4, null, false);
            } else {
                alay alayVar5 = apqsVar.j;
                if (alayVar5 == null) {
                    alayVar5 = alay.a;
                }
                spannedK = ackj.k(null, alayVar5, null, false);
            }
            switchCompatPreference.n(spannedK);
            if (d(apqsVar) == 21 || d(apqsVar) == 37) {
                strC = this.b.c(d(apqsVar) - 1);
                switchCompatPreference.y = Boolean.TRUE;
            } else if (d(apqsVar) == 74) {
                strC = this.b.c(d(apqsVar) - 1);
                switchCompatPreference.y = Boolean.FALSE;
            } else if (d(apqsVar) == 204) {
                ijt ijtVar = this.b;
                int iD = d(apqsVar) - 1;
                abww abwwVar = this.g;
                strC = ijtVar.c(iD);
                Boolean bool = (Boolean) abwwVar.o.orElse(Boolean.FALSE);
                bool.booleanValue();
                switchCompatPreference.y = bool;
            }
            if (strC != null) {
                switchCompatPreference.M(strC);
            } else if (d(apqsVar) == 224) {
                avlh avlhVarE = this.g.e();
                awjn awjnVar = new awjn();
                avlhVarE.ap(awjnVar);
                Object objD = awjnVar.d();
                if (objD == null) {
                    throw new NoSuchElementException();
                }
                switchCompatPreference.y = objD;
            }
            return switchCompatPreference;
        }
        int i4 = 2;
        if ((i & 16) != 0) {
            apre apreVar = apquVar.g;
            if (apreVar == null) {
                apreVar = apre.a;
            }
            ListPreference listPreference = new ListPreference(this.d);
            if ((apreVar.b & 2) != 0) {
                alay alayVar6 = apreVar.d;
                if (alayVar6 == null) {
                    alayVar6 = alay.a;
                }
                listPreference.Q(ackj.k(null, alayVar6, null, false));
                alay alayVar7 = apreVar.d;
                if (alayVar7 == null) {
                    alayVar7 = alay.a;
                }
                ((DialogPreference) listPreference).a = ackj.k(null, alayVar7, null, false);
            }
            if ((apreVar.b & 4) != 0) {
                alay alayVar8 = apreVar.e;
                if (alayVar8 == null) {
                    alayVar8 = alay.a;
                }
                listPreference.n(ackj.k(null, alayVar8, null, false));
            }
            List listC = aekf.c(apreVar);
            CharSequence[] charSequenceArr = new CharSequence[listC.size()];
            CharSequence[] charSequenceArr2 = new CharSequence[listC.size()];
            int i5 = -1;
            while (i3 < listC.size()) {
                apqz apqzVar = (apqz) listC.get(i3);
                charSequenceArr[i3] = apqzVar.c;
                charSequenceArr2[i3] = apqzVar.d;
                if (true == this.c.x(apqzVar).e) {
                    i5 = i3;
                }
                i3++;
            }
            listPreference.g = charSequenceArr;
            listPreference.h = charSequenceArr2;
            if (i5 != -1) {
                int i6 = i5 != -1 ? i5 : -1;
                CharSequence[] charSequenceArr3 = listPreference.h;
                if (charSequenceArr3 != null) {
                    listPreference.o(charSequenceArr3[i6].toString());
                }
                listPreference.n(listPreference.l());
            }
            listPreference.n = new iqw(this, apreVar, listPreference, i2);
            preference = listPreference;
        } else if ((i & 8) != 0) {
            aprd aprdVar = apquVar.f;
            if (aprdVar == null) {
                aprdVar = aprd.a;
            }
            Context context = this.d;
            Preference preference2 = new Preference(context);
            if ((aprdVar.b & 2) != 0) {
                alay alayVar9 = aprdVar.c;
                if (alayVar9 == null) {
                    alayVar9 = alay.a;
                }
                preference2.Q(ackj.k(null, alayVar9, null, false));
            }
            int i7 = aprdVar.b;
            if ((i7 & 8) != 0) {
                alay alayVar10 = aprdVar.d;
                if (alayVar10 == null) {
                    alayVar10 = alay.a;
                }
                preference2.n(ackj.k(null, alayVar10, null, false));
            } else if ((i7 & 32) != 0) {
                alay alayVar11 = aprdVar.e;
                if (alayVar11 == null) {
                    alayVar11 = alay.a;
                }
                preference2.n(ackj.k(null, alayVar11, null, false));
            }
            if (d(aprdVar) == 24) {
                preference2.n(txz.b(context));
            }
            preference2.o = new ioi(this, aprdVar, i3);
            preference = preference2;
        } else {
            if ((i & 1) == 0) {
                return null;
            }
            apqr apqrVar = apquVar.c;
            if (apqrVar == null) {
                apqrVar = apqr.a;
            }
            Preference preference3 = new Preference(this.d);
            if ((apqrVar.b & 2) != 0) {
                alayVar = apqrVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            preference3.Q(ackj.k(null, alayVar, null, false));
            if ((apqrVar.b & 4) != 0) {
                alay alayVar12 = apqrVar.d;
                if (alayVar12 == null) {
                    alayVar12 = alay.a;
                }
                preference3.n(ackj.k(null, alayVar12, null, false));
            }
            preference3.o = new ioi(this, apqrVar, i4);
            preference = preference3;
        }
        return preference;
    }
}
