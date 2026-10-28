package defpackage;

import android.content.ContentValues;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pts implements dob {
    private final /* synthetic */ int $cid;

    public pts(int i) {
        this.$cid = i;
    }

    @Override // defpackage.dob
    public final void a(dpd dpdVar) {
        if (this.$cid == 0) {
            dpdVar.e("UPDATE gnp_accounts SET account_type = 1");
            return;
        }
        dpdVar.e("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int i = 0;
        Object[] objArr = new Object[0];
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        Object[] objArr2 = new Object[size];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(dpl.a[3]);
        sb.append("WorkSpec SET ");
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < size; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        dps dpsVarI = ((dpl) dpdVar).i(sb.toString());
        azu.h(dpsVarI, objArr2);
        dpsVarI.a.executeUpdateDelete();
    }
}
