package defpackage;

import android.text.SpannableStringBuilder;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class accd implements zwz {
    public final accm a;
    private final int b;
    private final accg c = new accg();

    public accd(int i, boolean z, abmt abmtVar) {
        this.b = i;
        this.a = new accm(z, abmtVar.r.l(13, 45788117L, false), abmtVar.r.l(39, 45829804L, false), (int) abmtVar.r.c(10, 45838079L, 0L));
    }

    @Override // defpackage.zwz
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final acce a() {
        return new acce(this.b, this.a.a(), this.c.a());
    }

    public final void c(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            accm accmVar = this.a;
            accmVar.d((String) charSequence, i, i2);
            return;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            long jLongValue = i2;
            long j = i;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            accm accmVar2 = this.a;
            if (jLongValue == j) {
                List list = accmVar2.b;
                if (!list.isEmpty()) {
                    jLongValue = ((Long) aguu.K(list)).longValue();
                }
            }
            long j2 = jLongValue;
            List list2 = accmVar2.c;
            if (list2.isEmpty()) {
                accmVar2.e(spannableStringBuilder, j, j2);
                return;
            }
            CharSequence charSequence2 = (CharSequence) aguu.K(list2);
            if (j == ((Long) aguu.L(accmVar2.a, -1L)).longValue() && j2 == ((Long) aguu.L(accmVar2.b, -1L)).longValue()) {
                list2.set(list2.size() - 1, new SpannableStringBuilder(charSequence2).append((CharSequence) spannableStringBuilder));
            } else {
                accmVar2.e(new SpannableStringBuilder(charSequence2).append((CharSequence) spannableStringBuilder), j, j2);
            }
        }
    }

    public final void d(CharSequence charSequence, int i, int i2) {
        this.a.e(charSequence, i, i2);
    }

    public final void e(int i, accf accfVar) {
        long j = i;
        accg accgVar = this.c;
        List list = accgVar.a;
        if (!list.isEmpty() && j < ((Long) aguu.K(list)).longValue()) {
            ((agrc) ((agrc) acch.a.c()).k("com/google/android/libraries/youtube/player/subtitles/model/SubtitleWindowSettingsTimeline$Builder", "addSettings", 76, "SubtitleWindowSettingsTimeline.java")).t("subtitle settings are not given in non-decreasing start time order");
        }
        list.add(Long.valueOf(j));
        accgVar.b.add(accfVar);
    }
}
