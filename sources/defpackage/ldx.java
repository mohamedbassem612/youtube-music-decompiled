package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ldx implements Callable {
    final /* synthetic */ lcd a;
    final /* synthetic */ String b;
    final /* synthetic */ lcn c;

    public ldx(lcn lcnVar, lcd lcdVar, String str) {
        this.a = lcdVar;
        this.b = str;
        this.c = lcnVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05f7 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x0607  */
    /* JADX WARN: Code duplicated, block: B:104:0x0611 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0621  */
    /* JADX WARN: Code duplicated, block: B:107:0x0625 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0647 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0668 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0513 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0252 A[Catch: all -> 0x073c, TRY_LEAVE, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x02be A[Catch: SecurityException -> 0x071f, all -> 0x073c, TryCatch #3 {SecurityException -> 0x071f, blocks: (B:56:0x02b8, B:58:0x02be, B:60:0x02c4), top: B:134:0x02b8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x02ee A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x031b A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0332 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x035a A[Catch: all -> 0x073c, LOOP:1: B:75:0x0354->B:77:0x035a, LOOP_END, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0427 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0449 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x047a A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x04f2 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0569 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x05c9 A[Catch: all -> 0x073c, TryCatch #0 {all -> 0x073c, blocks: (B:9:0x0051, B:11:0x005c, B:12:0x006b, B:14:0x0071, B:15:0x0080, B:17:0x00b0, B:18:0x00c6, B:20:0x00d0, B:21:0x00e6, B:23:0x00f0, B:24:0x0106, B:26:0x0111, B:27:0x0126, B:29:0x0156, B:30:0x0169, B:32:0x01a0, B:34:0x01b0, B:35:0x01b3, B:37:0x01cc, B:39:0x01d2, B:41:0x01dc, B:43:0x01e2, B:45:0x01f4, B:47:0x01fa, B:49:0x0204, B:50:0x0221, B:52:0x0225, B:54:0x023f, B:44:0x01eb, B:55:0x0252, B:56:0x02b8, B:58:0x02be, B:60:0x02c4, B:61:0x02e4, B:63:0x02ee, B:64:0x0305, B:65:0x0315, B:67:0x031b, B:73:0x0332, B:74:0x034d, B:75:0x0354, B:77:0x035a, B:78:0x03b1, B:80:0x0427, B:81:0x043b, B:83:0x0449, B:86:0x048d, B:87:0x04ec, B:89:0x04f2, B:91:0x0513, B:92:0x051e, B:94:0x0569, B:95:0x056f, B:97:0x05c9, B:98:0x05ef, B:100:0x05f7, B:102:0x0609, B:104:0x0611, B:108:0x0634, B:111:0x0649, B:112:0x0658, B:114:0x0668, B:115:0x067b, B:107:0x0625, B:85:0x047a, B:123:0x0721), top: B:129:0x0051, inners: #2, #3 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        byte[] bArr;
        String strW;
        List listB;
        Iterator it;
        aaqp aaqpVar;
        lix[] lixVarArr;
        int i;
        lfv lfvVar;
        Bundle bundle;
        String str;
        lca lcaVarJ;
        lbd lbdVar;
        lfv lfvVar2;
        aihf aihfVar;
        Bundle bundle2;
        long j;
        lca lcaVarC;
        lbd lbdVar2;
        aihf aihfVarCreateBuilder;
        lcc lccVar;
        lcb lcbVar;
        aihf aihfVar2;
        lis lisVar;
        aiie aiieVar;
        lin linVar;
        long jK;
        long jM;
        String strE;
        ldr ldrVar;
        long j2;
        aihf aihfVarCreateBuilder2;
        Object objC;
        lfv lfvVar3 = this.c.a;
        lfvVar3.B();
        lew lewVar = lfvVar3.f;
        lfv.ai(lewVar);
        lewVar.o();
        ldr.B();
        lcd lcdVar = this.a;
        kro.l(lcdVar);
        String str2 = this.b;
        kro.i(str2);
        String str3 = lcdVar.a;
        boolean zEquals = "_iap".equals(str3);
        ldr ldrVar2 = lewVar.t;
        if (!zEquals && !"_iapx".equals(str3)) {
            lewVar.aT().j.c("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        aihf aihfVarCreateBuilder3 = liq.a.createBuilder();
        lewVar.v().F();
        try {
            lbd lbdVarH = lewVar.v().h(str2);
            if (lbdVarH == null) {
                lewVar.aT().j.b("Log and bundle not available. package_name", str2);
                bArr = new byte[0];
            } else if (lbdVarH.au()) {
                aihf aihfVarCreateBuilder4 = lir.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                lir lirVar = (lir) aihfVarCreateBuilder4.instance;
                boolean z = true;
                lirVar.b |= 1;
                lirVar.d = 1;
                aihfVarCreateBuilder4.copyOnWrite();
                lir lirVar2 = (lir) aihfVarCreateBuilder4.instance;
                lirVar2.b |= 64;
                lirVar2.l = "android";
                if (!TextUtils.isEmpty(lbdVarH.w())) {
                    String strW2 = lbdVarH.w();
                    aihfVarCreateBuilder4.copyOnWrite();
                    lir lirVar3 = (lir) aihfVarCreateBuilder4.instance;
                    strW2.getClass();
                    lirVar3.b |= SemanticState.Obscured;
                    lirVar3.r = strW2;
                }
                if (!TextUtils.isEmpty(lbdVarH.y())) {
                    String strY = lbdVarH.y();
                    kro.l(strY);
                    aihfVarCreateBuilder4.copyOnWrite();
                    lir lirVar4 = (lir) aihfVarCreateBuilder4.instance;
                    lirVar4.b |= SemanticState.Modal;
                    lirVar4.q = strY;
                }
                if (!TextUtils.isEmpty(lbdVarH.z())) {
                    String strZ = lbdVarH.z();
                    kro.l(strZ);
                    aihfVarCreateBuilder4.copyOnWrite();
                    lir lirVar5 = (lir) aihfVarCreateBuilder4.instance;
                    lirVar5.b |= SemanticState.Multiline;
                    lirVar5.s = strZ;
                }
                if (lbdVarH.c() != -2147483648L) {
                    int iC = (int) lbdVarH.c();
                    aihfVarCreateBuilder4.copyOnWrite();
                    lir lirVar6 = (lir) aihfVarCreateBuilder4.instance;
                    lirVar6.b |= 33554432;
                    lirVar6.F = iC;
                }
                long jI = lbdVarH.i();
                aihfVarCreateBuilder4.copyOnWrite();
                lir lirVar7 = (lir) aihfVarCreateBuilder4.instance;
                lirVar7.b |= 16384;
                lirVar7.t = jI;
                long jG = lbdVarH.g();
                aihfVarCreateBuilder4.copyOnWrite();
                lir lirVar8 = (lir) aihfVarCreateBuilder4.instance;
                lirVar8.c |= 16;
                lirVar8.M = jG;
                String strB = lbdVarH.B();
                if (!TextUtils.isEmpty(strB)) {
                    aihfVarCreateBuilder4.copyOnWrite();
                    lir lirVar9 = (lir) aihfVarCreateBuilder4.instance;
                    strB.getClass();
                    lirVar9.b |= 4194304;
                    lirVar9.B = strB;
                }
                long jR = lbdVarH.r();
                aihfVarCreateBuilder4.copyOnWrite();
                lir lirVar10 = (lir) aihfVarCreateBuilder4.instance;
                lirVar10.c |= 32768;
                lirVar10.S = jR;
                lgh lghVarU = lewVar.l.u(str2);
                long jF = lbdVarH.f();
                aihfVarCreateBuilder4.copyOnWrite();
                lir lirVar11 = (lir) aihfVarCreateBuilder4.instance;
                lirVar11.b |= 524288;
                lirVar11.y = jF;
                if (ldrVar2.w() && lewVar.G().n(((lir) aihfVarCreateBuilder4.instance).r)) {
                    lghVarU.m();
                }
                String strK = lghVarU.k();
                aihfVarCreateBuilder4.copyOnWrite();
                lir lirVar12 = (lir) aihfVarCreateBuilder4.instance;
                lirVar12.c |= SemanticState.Focused;
                lirVar12.O = strK;
                if (lghVarU.m() && lbdVarH.as()) {
                    Pair pairA = (lghVarU.m() && lbdVarH.as()) ? lewVar.t().a(lbdVarH.w()) : new Pair("", Boolean.FALSE);
                    if (!lbdVarH.as() || TextUtils.isEmpty((CharSequence) pairA.first)) {
                        String strB2 = lewVar.H().b();
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar13 = (lir) aihfVarCreateBuilder4.instance;
                        strB2.getClass();
                        lirVar13.b |= SemanticState.Hidden;
                        lirVar13.n = strB2;
                        String strC = lewVar.H().c();
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar14 = (lir) aihfVarCreateBuilder4.instance;
                        strC.getClass();
                        lirVar14.b |= SemanticState.Focused;
                        lirVar14.m = strC;
                        int iA = (int) lewVar.H().a();
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar15 = (lir) aihfVarCreateBuilder4.instance;
                        lirVar15.b |= SemanticState.ReadOnly;
                        lirVar15.p = iA;
                        String strD = lewVar.H().d();
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar16 = (lir) aihfVarCreateBuilder4.instance;
                        strD.getClass();
                        lirVar16.b |= SemanticState.LiveRegion;
                        lirVar16.o = strD;
                        if (lghVarU.o()) {
                            kro.l(lbdVarH.x());
                            long j3 = lcdVar.d;
                            String strA = lew.a();
                            aihfVarCreateBuilder4.copyOnWrite();
                            lir lirVar17 = (lir) aihfVarCreateBuilder4.instance;
                            strA.getClass();
                            lirVar17.b |= 262144;
                            lirVar17.x = strA;
                        }
                        if (!TextUtils.isEmpty(lbdVarH.A())) {
                            String strA2 = lbdVarH.A();
                            kro.l(strA2);
                            aihfVarCreateBuilder4.copyOnWrite();
                            lir lirVar18 = (lir) aihfVarCreateBuilder4.instance;
                            lirVar18.b |= 16777216;
                            lirVar18.E = strA2;
                        }
                        strW = lbdVarH.w();
                        listB = lewVar.v().B(strW);
                        it = listB.iterator();
                        do {
                            if (!it.hasNext()) {
                                aaqpVar = null;
                                break;
                            }
                            aaqpVar = (aaqp) it.next();
                        } while (!"_lte".equals(aaqpVar.d));
                        if (aaqpVar == null) {
                            aaqp aaqpVar2 = new aaqp(strW, "auto", "_lte", System.currentTimeMillis(), (Object) 0L);
                            listB.add(aaqpVar2);
                            lewVar.v().aq(aaqpVar2);
                        }
                        lixVarArr = new lix[listB.size()];
                        i = 0;
                        while (i < listB.size()) {
                            aihf aihfVarCreateBuilder5 = lix.a.createBuilder();
                            Object obj = ((aaqp) listB.get(i)).d;
                            aihfVarCreateBuilder5.copyOnWrite();
                            lix lixVar = (lix) aihfVarCreateBuilder5.instance;
                            obj.getClass();
                            lixVar.b |= 2;
                            lixVar.d = (String) obj;
                            long j4 = ((aaqp) listB.get(i)).a;
                            aihfVarCreateBuilder5.copyOnWrite();
                            lix lixVar2 = (lix) aihfVarCreateBuilder5.instance;
                            lixVar2.b |= 1;
                            lixVar2.c = j4;
                            lewVar.u().Y(aihfVarCreateBuilder5, ((aaqp) listB.get(i)).c);
                            lixVarArr[i] = (lix) aihfVarCreateBuilder5.build();
                            i++;
                            z = z;
                        }
                        List listAsList = Arrays.asList(lixVarArr);
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar19 = (lir) aihfVarCreateBuilder4.instance;
                        lirVar19.b();
                        aifs.addAll(listAsList, lirVar19.f);
                        lfvVar = lewVar.l;
                        lfvVar.al(lbdVarH, aihfVarCreateBuilder4);
                        lfvVar.am(lbdVarH, aihfVarCreateBuilder4);
                        lfvVar.ao(lbdVarH.w(), aihfVarCreateBuilder4);
                        lda ldaVarB = lda.b(lcdVar);
                        lga lgaVarL = lewVar.L();
                        bundle = ldaVarB.e;
                        lgaVarL.O(bundle, lewVar.v().g(str2));
                        lewVar.L().Q(ldaVarB, lewVar.G().f(str2));
                        bundle.putLong("_c", 1L);
                        lewVar.aT().j.a("Marking in-app purchase as real-time");
                        bundle.putLong("_r", 1L);
                        String str4 = lcdVar.c;
                        bundle.putString("_o", str4);
                        if (lewVar.L().ak(((lir) aihfVarCreateBuilder4.instance).r, lbdVarH.F())) {
                            lewVar.L().S(bundle, "_dbg", 1L);
                            lewVar.L().S(bundle, "_r", 1L);
                        }
                        lgp lgpVarV = lewVar.v();
                        str = lcdVar.a;
                        lcaVarJ = lgpVarV.j("events", str2, str);
                        lbdVar = lbdVarH;
                        if (lcaVarJ == null) {
                            bundle2 = bundle;
                            aihfVar = aihfVarCreateBuilder4;
                            lfvVar2 = lfvVar;
                            lcaVarC = new lca(str2, str, 0L, 0L, 0L, lcdVar.d, 0L, null, null, null, null);
                            lbdVar = lbdVar;
                            j = 0;
                        } else {
                            lfvVar2 = lfvVar;
                            aihfVar = aihfVarCreateBuilder4;
                            bundle2 = bundle;
                            j = lcaVarJ.f;
                            lcaVarC = lcaVarJ.c(lcdVar.d);
                        }
                        lca lcaVar = lcaVarC;
                        lewVar.v().aa("events", lcaVar);
                        lbdVar2 = lbdVar;
                        lbz lbzVar = new lbz(lewVar.t, str4, str2, str, lcdVar.d, 0L, j, bundle2);
                        aihfVarCreateBuilder = lin.a.createBuilder();
                        long j5 = lbzVar.d;
                        aihfVarCreateBuilder.copyOnWrite();
                        lin linVar2 = (lin) aihfVarCreateBuilder.instance;
                        linVar2.b |= 2;
                        linVar2.e = j5;
                        String str5 = lbzVar.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        lin linVar3 = (lin) aihfVarCreateBuilder.instance;
                        str5.getClass();
                        linVar3.b |= 1;
                        linVar3.d = str5;
                        long j6 = lbzVar.f;
                        aihfVarCreateBuilder.copyOnWrite();
                        lin linVar4 = (lin) aihfVarCreateBuilder.instance;
                        linVar4.b |= 4;
                        linVar4.f = j6;
                        lccVar = lbzVar.g;
                        lcbVar = new lcb(lccVar);
                        while (lcbVar.hasNext()) {
                            String next = lcbVar.next();
                            aihfVarCreateBuilder2 = lip.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            lip lipVar = (lip) aihfVarCreateBuilder2.instance;
                            next.getClass();
                            lipVar.b |= 1;
                            lipVar.c = next;
                            objC = lccVar.c(next);
                            if (objC != null) {
                                lewVar.u().X(aihfVarCreateBuilder2, objC);
                                aihfVarCreateBuilder.bg(aihfVarCreateBuilder2);
                            }
                        }
                        aihfVar2 = aihfVar;
                        aihfVar2.bk(aihfVarCreateBuilder);
                        aihf aihfVarCreateBuilder6 = lis.a.createBuilder();
                        aihf aihfVarCreateBuilder7 = lio.a.createBuilder();
                        long j7 = lcaVar.c;
                        aihfVarCreateBuilder7.copyOnWrite();
                        lio lioVar = (lio) aihfVarCreateBuilder7.instance;
                        lioVar.b |= 2;
                        lioVar.d = j7;
                        aihfVarCreateBuilder7.copyOnWrite();
                        lio lioVar2 = (lio) aihfVarCreateBuilder7.instance;
                        str.getClass();
                        lioVar2.b |= 1;
                        lioVar2.c = str;
                        aihfVarCreateBuilder6.copyOnWrite();
                        lisVar = (lis) aihfVarCreateBuilder6.instance;
                        lio lioVar3 = (lio) aihfVarCreateBuilder7.build();
                        lioVar3.getClass();
                        aiieVar = lisVar.b;
                        if (!aiieVar.c()) {
                            lisVar.b = aihn.mutableCopy(aiieVar);
                        }
                        lisVar.b.add(lioVar3);
                        aihfVar2.copyOnWrite();
                        lir lirVar20 = (lir) aihfVar2.instance;
                        lis lisVar2 = (lis) aihfVarCreateBuilder6.build();
                        lisVar2.getClass();
                        lirVar20.K = lisVar2;
                        lirVar20.c |= 8;
                        aihfVar2.I(lewVar.l.h().a(lbdVar2.w(), Collections.EMPTY_LIST, DesugarCollections.unmodifiableList(((lir) aihfVar2.instance).f), Long.valueOf(((lin) aihfVarCreateBuilder.instance).e), Long.valueOf(((lin) aihfVarCreateBuilder.instance).e), false));
                        linVar = (lin) aihfVarCreateBuilder.instance;
                        if ((linVar.b & 2) != 0) {
                            long j8 = linVar.e;
                            aihfVar2.copyOnWrite();
                            lir lirVar21 = (lir) aihfVar2.instance;
                            lirVar21.b |= 4;
                            lirVar21.h = j8;
                            long j9 = ((lin) aihfVarCreateBuilder.instance).e;
                            aihfVar2.copyOnWrite();
                            lir lirVar22 = (lir) aihfVar2.instance;
                            lirVar22.b |= 8;
                            lirVar22.i = j9;
                        }
                        jK = lbdVar2.k();
                        if (jK != 0) {
                            aihfVar2.copyOnWrite();
                            lir lirVar23 = (lir) aihfVar2.instance;
                            lirVar23.b |= 32;
                            lirVar23.k = jK;
                        } else {
                            jK = 0;
                        }
                        jM = lbdVar2.m();
                        if (jM != 0) {
                            aihfVar2.copyOnWrite();
                            lir lirVar24 = (lir) aihfVar2.instance;
                            lirVar24.b |= 16;
                            lirVar24.j = jM;
                        } else if (jK != 0) {
                            aihfVar2.copyOnWrite();
                            lir lirVar25 = (lir) aihfVar2.instance;
                            lirVar25.b |= 16;
                            lirVar25.j = jK;
                        }
                        strE = lbdVar2.E();
                        autm.c();
                        if (lewVar.G().F(str2, lcl.aM)) {
                            aihfVar2.copyOnWrite();
                            lir lirVar26 = (lir) aihfVar2.instance;
                            lirVar26.c |= SemanticState.Multiline;
                            lirVar26.P = strE;
                        }
                        ldrVar = lbdVar2.a;
                        ldrVar.r();
                        j2 = lbdVar2.c + 1;
                        if (j2 > 2147483647L) {
                            ldrVar.aT().f.b("Bundle index overflow. appId", lcz.a(lbdVar2.b));
                            j2 = 0;
                        }
                        lbdVar2.o = true;
                        lbdVar2.c = j2;
                        int iL = (int) lbdVar2.l();
                        aihfVar2.copyOnWrite();
                        lir lirVar27 = (lir) aihfVar2.instance;
                        lirVar27.b |= 1048576;
                        lirVar27.z = iL;
                        aihfVar2.copyOnWrite();
                        lir lirVar28 = (lir) aihfVar2.instance;
                        lirVar28.b |= 32768;
                        lirVar28.u = 192008L;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        aihfVar2.copyOnWrite();
                        lir lirVar29 = (lir) aihfVar2.instance;
                        lirVar29.b |= 2;
                        lirVar29.g = jCurrentTimeMillis;
                        aihfVar2.copyOnWrite();
                        lir lirVar30 = (lir) aihfVar2.instance;
                        lirVar30.b |= 8388608;
                        lirVar30.C = true;
                        lfvVar2.ak(lirVar30.r, aihfVar2);
                        aihfVarCreateBuilder3.bi(aihfVar2);
                        lbdVar2.ab(((lir) aihfVar2.instance).h);
                        lbdVar2.Z(((lir) aihfVar2.instance).i);
                        lewVar.v().an(lbdVar2, false);
                        lewVar.v().Y();
                        lewVar.v().S();
                        return lewVar.u().N(((liq) aihfVarCreateBuilder3.build()).toByteArray());
                    }
                    try {
                        long j10 = lcdVar.d;
                        String strA3 = lew.a();
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar31 = (lir) aihfVarCreateBuilder4.instance;
                        strA3.getClass();
                        lirVar31.b |= 65536;
                        lirVar31.v = strA3;
                        if (pairA.second != null) {
                            boolean zBooleanValue = ((Boolean) pairA.second).booleanValue();
                            aihfVarCreateBuilder4.copyOnWrite();
                            lir lirVar32 = (lir) aihfVarCreateBuilder4.instance;
                            lirVar32.b |= 131072;
                            lirVar32.w = zBooleanValue;
                        }
                        String strB3 = lewVar.H().b();
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar110 = (lir) aihfVarCreateBuilder4.instance;
                        strB3.getClass();
                        lirVar110.b |= SemanticState.Hidden;
                        lirVar110.n = strB3;
                        String strC2 = lewVar.H().c();
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar111 = (lir) aihfVarCreateBuilder4.instance;
                        strC2.getClass();
                        lirVar111.b |= SemanticState.Focused;
                        lirVar111.m = strC2;
                        int iA2 = (int) lewVar.H().a();
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar112 = (lir) aihfVarCreateBuilder4.instance;
                        lirVar112.b |= SemanticState.ReadOnly;
                        lirVar112.p = iA2;
                        String strD2 = lewVar.H().d();
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar113 = (lir) aihfVarCreateBuilder4.instance;
                        strD2.getClass();
                        lirVar113.b |= SemanticState.LiveRegion;
                        lirVar113.o = strD2;
                        if (lghVarU.o()) {
                            kro.l(lbdVarH.x());
                            long j11 = lcdVar.d;
                            String strA4 = lew.a();
                            aihfVarCreateBuilder4.copyOnWrite();
                            lir lirVar114 = (lir) aihfVarCreateBuilder4.instance;
                            strA4.getClass();
                            lirVar114.b |= 262144;
                            lirVar114.x = strA4;
                        }
                        if (!TextUtils.isEmpty(lbdVarH.A())) {
                            String strA5 = lbdVarH.A();
                            kro.l(strA5);
                            aihfVarCreateBuilder4.copyOnWrite();
                            lir lirVar115 = (lir) aihfVarCreateBuilder4.instance;
                            lirVar115.b |= 16777216;
                            lirVar115.E = strA5;
                        }
                        strW = lbdVarH.w();
                        listB = lewVar.v().B(strW);
                        it = listB.iterator();
                        do {
                            if (!it.hasNext()) {
                                aaqpVar = null;
                                break;
                            }
                            aaqpVar = (aaqp) it.next();
                        } while (!"_lte".equals(aaqpVar.d));
                        if (aaqpVar == null) {
                            aaqp aaqpVar3 = new aaqp(strW, "auto", "_lte", System.currentTimeMillis(), (Object) 0L);
                            listB.add(aaqpVar3);
                            lewVar.v().aq(aaqpVar3);
                        }
                        lixVarArr = new lix[listB.size()];
                        i = 0;
                        while (i < listB.size()) {
                            aihf aihfVarCreateBuilder8 = lix.a.createBuilder();
                            Object obj2 = ((aaqp) listB.get(i)).d;
                            aihfVarCreateBuilder8.copyOnWrite();
                            lix lixVar3 = (lix) aihfVarCreateBuilder8.instance;
                            obj2.getClass();
                            lixVar3.b |= 2;
                            lixVar3.d = (String) obj2;
                            long j12 = ((aaqp) listB.get(i)).a;
                            aihfVarCreateBuilder8.copyOnWrite();
                            lix lixVar4 = (lix) aihfVarCreateBuilder8.instance;
                            lixVar4.b |= 1;
                            lixVar4.c = j12;
                            lewVar.u().Y(aihfVarCreateBuilder8, ((aaqp) listB.get(i)).c);
                            lixVarArr[i] = (lix) aihfVarCreateBuilder8.build();
                            i++;
                            z = z;
                        }
                        List listAsList2 = Arrays.asList(lixVarArr);
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar116 = (lir) aihfVarCreateBuilder4.instance;
                        lirVar116.b();
                        aifs.addAll(listAsList2, lirVar116.f);
                        lfvVar = lewVar.l;
                        lfvVar.al(lbdVarH, aihfVarCreateBuilder4);
                        lfvVar.am(lbdVarH, aihfVarCreateBuilder4);
                        lfvVar.ao(lbdVarH.w(), aihfVarCreateBuilder4);
                        lda ldaVarB2 = lda.b(lcdVar);
                        lga lgaVarL2 = lewVar.L();
                        bundle = ldaVarB2.e;
                        lgaVarL2.O(bundle, lewVar.v().g(str2));
                        lewVar.L().Q(ldaVarB2, lewVar.G().f(str2));
                        bundle.putLong("_c", 1L);
                        lewVar.aT().j.a("Marking in-app purchase as real-time");
                        bundle.putLong("_r", 1L);
                        String str6 = lcdVar.c;
                        bundle.putString("_o", str6);
                        if (lewVar.L().ak(((lir) aihfVarCreateBuilder4.instance).r, lbdVarH.F())) {
                            lewVar.L().S(bundle, "_dbg", 1L);
                            lewVar.L().S(bundle, "_r", 1L);
                        }
                        lgp lgpVarV2 = lewVar.v();
                        str = lcdVar.a;
                        lcaVarJ = lgpVarV2.j("events", str2, str);
                        lbdVar = lbdVarH;
                        if (lcaVarJ == null) {
                            bundle2 = bundle;
                            aihfVar = aihfVarCreateBuilder4;
                            lfvVar2 = lfvVar;
                            lcaVarC = new lca(str2, str, 0L, 0L, 0L, lcdVar.d, 0L, null, null, null, null);
                            lbdVar = lbdVar;
                            j = 0;
                        } else {
                            lfvVar2 = lfvVar;
                            aihfVar = aihfVarCreateBuilder4;
                            bundle2 = bundle;
                            j = lcaVarJ.f;
                            lcaVarC = lcaVarJ.c(lcdVar.d);
                        }
                        lca lcaVar2 = lcaVarC;
                        lewVar.v().aa("events", lcaVar2);
                        lbdVar2 = lbdVar;
                        lbz lbzVar2 = new lbz(lewVar.t, str6, str2, str, lcdVar.d, 0L, j, bundle2);
                        aihfVarCreateBuilder = lin.a.createBuilder();
                        long j13 = lbzVar2.d;
                        aihfVarCreateBuilder.copyOnWrite();
                        lin linVar5 = (lin) aihfVarCreateBuilder.instance;
                        linVar5.b |= 2;
                        linVar5.e = j13;
                        String str7 = lbzVar2.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        lin linVar6 = (lin) aihfVarCreateBuilder.instance;
                        str7.getClass();
                        linVar6.b |= 1;
                        linVar6.d = str7;
                        long j14 = lbzVar2.f;
                        aihfVarCreateBuilder.copyOnWrite();
                        lin linVar7 = (lin) aihfVarCreateBuilder.instance;
                        linVar7.b |= 4;
                        linVar7.f = j14;
                        lccVar = lbzVar2.g;
                        lcbVar = new lcb(lccVar);
                        while (lcbVar.hasNext()) {
                            String next2 = lcbVar.next();
                            aihfVarCreateBuilder2 = lip.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            lip lipVar2 = (lip) aihfVarCreateBuilder2.instance;
                            next2.getClass();
                            lipVar2.b |= 1;
                            lipVar2.c = next2;
                            objC = lccVar.c(next2);
                            if (objC != null) {
                                lewVar.u().X(aihfVarCreateBuilder2, objC);
                                aihfVarCreateBuilder.bg(aihfVarCreateBuilder2);
                            }
                        }
                        aihfVar2 = aihfVar;
                        aihfVar2.bk(aihfVarCreateBuilder);
                        aihf aihfVarCreateBuilder9 = lis.a.createBuilder();
                        aihf aihfVarCreateBuilder10 = lio.a.createBuilder();
                        long j15 = lcaVar2.c;
                        aihfVarCreateBuilder10.copyOnWrite();
                        lio lioVar4 = (lio) aihfVarCreateBuilder10.instance;
                        lioVar4.b |= 2;
                        lioVar4.d = j15;
                        aihfVarCreateBuilder10.copyOnWrite();
                        lio lioVar5 = (lio) aihfVarCreateBuilder10.instance;
                        str.getClass();
                        lioVar5.b |= 1;
                        lioVar5.c = str;
                        aihfVarCreateBuilder9.copyOnWrite();
                        lisVar = (lis) aihfVarCreateBuilder9.instance;
                        lio lioVar6 = (lio) aihfVarCreateBuilder10.build();
                        lioVar6.getClass();
                        aiieVar = lisVar.b;
                        if (!aiieVar.c()) {
                            lisVar.b = aihn.mutableCopy(aiieVar);
                        }
                        lisVar.b.add(lioVar6);
                        aihfVar2.copyOnWrite();
                        lir lirVar210 = (lir) aihfVar2.instance;
                        lis lisVar3 = (lis) aihfVarCreateBuilder9.build();
                        lisVar3.getClass();
                        lirVar210.K = lisVar3;
                        lirVar210.c |= 8;
                        aihfVar2.I(lewVar.l.h().a(lbdVar2.w(), Collections.EMPTY_LIST, DesugarCollections.unmodifiableList(((lir) aihfVar2.instance).f), Long.valueOf(((lin) aihfVarCreateBuilder.instance).e), Long.valueOf(((lin) aihfVarCreateBuilder.instance).e), false));
                        linVar = (lin) aihfVarCreateBuilder.instance;
                        if ((linVar.b & 2) != 0) {
                            long j16 = linVar.e;
                            aihfVar2.copyOnWrite();
                            lir lirVar211 = (lir) aihfVar2.instance;
                            lirVar211.b |= 4;
                            lirVar211.h = j16;
                            long j17 = ((lin) aihfVarCreateBuilder.instance).e;
                            aihfVar2.copyOnWrite();
                            lir lirVar212 = (lir) aihfVar2.instance;
                            lirVar212.b |= 8;
                            lirVar212.i = j17;
                        }
                        jK = lbdVar2.k();
                        if (jK != 0) {
                            aihfVar2.copyOnWrite();
                            lir lirVar213 = (lir) aihfVar2.instance;
                            lirVar213.b |= 32;
                            lirVar213.k = jK;
                        } else {
                            jK = 0;
                        }
                        jM = lbdVar2.m();
                        if (jM != 0) {
                            aihfVar2.copyOnWrite();
                            lir lirVar214 = (lir) aihfVar2.instance;
                            lirVar214.b |= 16;
                            lirVar214.j = jM;
                        } else if (jK != 0) {
                            aihfVar2.copyOnWrite();
                            lir lirVar215 = (lir) aihfVar2.instance;
                            lirVar215.b |= 16;
                            lirVar215.j = jK;
                        }
                        strE = lbdVar2.E();
                        autm.c();
                        if (lewVar.G().F(str2, lcl.aM)) {
                            aihfVar2.copyOnWrite();
                            lir lirVar216 = (lir) aihfVar2.instance;
                            lirVar216.c |= SemanticState.Multiline;
                            lirVar216.P = strE;
                        }
                        ldrVar = lbdVar2.a;
                        ldrVar.r();
                        j2 = lbdVar2.c + 1;
                        if (j2 > 2147483647L) {
                            ldrVar.aT().f.b("Bundle index overflow. appId", lcz.a(lbdVar2.b));
                            j2 = 0;
                        }
                        lbdVar2.o = true;
                        lbdVar2.c = j2;
                        int iL2 = (int) lbdVar2.l();
                        aihfVar2.copyOnWrite();
                        lir lirVar217 = (lir) aihfVar2.instance;
                        lirVar217.b |= 1048576;
                        lirVar217.z = iL2;
                        aihfVar2.copyOnWrite();
                        lir lirVar218 = (lir) aihfVar2.instance;
                        lirVar218.b |= 32768;
                        lirVar218.u = 192008L;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        aihfVar2.copyOnWrite();
                        lir lirVar219 = (lir) aihfVar2.instance;
                        lirVar219.b |= 2;
                        lirVar219.g = jCurrentTimeMillis2;
                        aihfVar2.copyOnWrite();
                        lir lirVar33 = (lir) aihfVar2.instance;
                        lirVar33.b |= 8388608;
                        lirVar33.C = true;
                        lfvVar2.ak(lirVar33.r, aihfVar2);
                        aihfVarCreateBuilder3.bi(aihfVar2);
                        lbdVar2.ab(((lir) aihfVar2.instance).h);
                        lbdVar2.Z(((lir) aihfVar2.instance).i);
                        lewVar.v().an(lbdVar2, false);
                        lewVar.v().Y();
                        lewVar.v().S();
                        return lewVar.u().N(((liq) aihfVarCreateBuilder3.build()).toByteArray());
                    } catch (SecurityException e) {
                        lewVar.aT().j.b("Resettable device id encryption failed", e.getMessage());
                        bArr = new byte[0];
                    }
                } else {
                    String strB4 = lewVar.H().b();
                    aihfVarCreateBuilder4.copyOnWrite();
                    lir lirVar117 = (lir) aihfVarCreateBuilder4.instance;
                    strB4.getClass();
                    lirVar117.b |= SemanticState.Hidden;
                    lirVar117.n = strB4;
                    String strC3 = lewVar.H().c();
                    aihfVarCreateBuilder4.copyOnWrite();
                    lir lirVar118 = (lir) aihfVarCreateBuilder4.instance;
                    strC3.getClass();
                    lirVar118.b |= SemanticState.Focused;
                    lirVar118.m = strC3;
                    int iA3 = (int) lewVar.H().a();
                    aihfVarCreateBuilder4.copyOnWrite();
                    lir lirVar119 = (lir) aihfVarCreateBuilder4.instance;
                    lirVar119.b |= SemanticState.ReadOnly;
                    lirVar119.p = iA3;
                    String strD3 = lewVar.H().d();
                    aihfVarCreateBuilder4.copyOnWrite();
                    lir lirVar1110 = (lir) aihfVarCreateBuilder4.instance;
                    strD3.getClass();
                    lirVar1110.b |= SemanticState.LiveRegion;
                    lirVar1110.o = strD3;
                    try {
                        if (lghVarU.o() && lbdVarH.x() != null) {
                            kro.l(lbdVarH.x());
                            long j18 = lcdVar.d;
                            String strA6 = lew.a();
                            aihfVarCreateBuilder4.copyOnWrite();
                            lir lirVar1111 = (lir) aihfVarCreateBuilder4.instance;
                            strA6.getClass();
                            lirVar1111.b |= 262144;
                            lirVar1111.x = strA6;
                        }
                        if (!TextUtils.isEmpty(lbdVarH.A())) {
                            String strA7 = lbdVarH.A();
                            kro.l(strA7);
                            aihfVarCreateBuilder4.copyOnWrite();
                            lir lirVar1112 = (lir) aihfVarCreateBuilder4.instance;
                            lirVar1112.b |= 16777216;
                            lirVar1112.E = strA7;
                        }
                        strW = lbdVarH.w();
                        listB = lewVar.v().B(strW);
                        it = listB.iterator();
                        do {
                            if (!it.hasNext()) {
                                aaqpVar = null;
                                break;
                            }
                            aaqpVar = (aaqp) it.next();
                        } while (!"_lte".equals(aaqpVar.d));
                        if (aaqpVar == null) {
                            aaqp aaqpVar4 = new aaqp(strW, "auto", "_lte", System.currentTimeMillis(), (Object) 0L);
                            listB.add(aaqpVar4);
                            lewVar.v().aq(aaqpVar4);
                        }
                        lixVarArr = new lix[listB.size()];
                        i = 0;
                        while (i < listB.size()) {
                            aihf aihfVarCreateBuilder11 = lix.a.createBuilder();
                            Object obj3 = ((aaqp) listB.get(i)).d;
                            aihfVarCreateBuilder11.copyOnWrite();
                            lix lixVar5 = (lix) aihfVarCreateBuilder11.instance;
                            obj3.getClass();
                            lixVar5.b |= 2;
                            lixVar5.d = (String) obj3;
                            long j19 = ((aaqp) listB.get(i)).a;
                            aihfVarCreateBuilder11.copyOnWrite();
                            lix lixVar6 = (lix) aihfVarCreateBuilder11.instance;
                            lixVar6.b |= 1;
                            lixVar6.c = j19;
                            lewVar.u().Y(aihfVarCreateBuilder11, ((aaqp) listB.get(i)).c);
                            lixVarArr[i] = (lix) aihfVarCreateBuilder11.build();
                            i++;
                            z = z;
                        }
                        List listAsList3 = Arrays.asList(lixVarArr);
                        aihfVarCreateBuilder4.copyOnWrite();
                        lir lirVar1113 = (lir) aihfVarCreateBuilder4.instance;
                        lirVar1113.b();
                        aifs.addAll(listAsList3, lirVar1113.f);
                        lfvVar = lewVar.l;
                        lfvVar.al(lbdVarH, aihfVarCreateBuilder4);
                        lfvVar.am(lbdVarH, aihfVarCreateBuilder4);
                        lfvVar.ao(lbdVarH.w(), aihfVarCreateBuilder4);
                        lda ldaVarB3 = lda.b(lcdVar);
                        lga lgaVarL3 = lewVar.L();
                        bundle = ldaVarB3.e;
                        lgaVarL3.O(bundle, lewVar.v().g(str2));
                        lewVar.L().Q(ldaVarB3, lewVar.G().f(str2));
                        bundle.putLong("_c", 1L);
                        lewVar.aT().j.a("Marking in-app purchase as real-time");
                        bundle.putLong("_r", 1L);
                        String str8 = lcdVar.c;
                        bundle.putString("_o", str8);
                        if (lewVar.L().ak(((lir) aihfVarCreateBuilder4.instance).r, lbdVarH.F())) {
                            lewVar.L().S(bundle, "_dbg", 1L);
                            lewVar.L().S(bundle, "_r", 1L);
                        }
                        lgp lgpVarV3 = lewVar.v();
                        str = lcdVar.a;
                        lcaVarJ = lgpVarV3.j("events", str2, str);
                        lbdVar = lbdVarH;
                        if (lcaVarJ == null) {
                            bundle2 = bundle;
                            aihfVar = aihfVarCreateBuilder4;
                            lfvVar2 = lfvVar;
                            lcaVarC = new lca(str2, str, 0L, 0L, 0L, lcdVar.d, 0L, null, null, null, null);
                            lbdVar = lbdVar;
                            j = 0;
                        } else {
                            lfvVar2 = lfvVar;
                            aihfVar = aihfVarCreateBuilder4;
                            bundle2 = bundle;
                            j = lcaVarJ.f;
                            lcaVarC = lcaVarJ.c(lcdVar.d);
                        }
                        lca lcaVar3 = lcaVarC;
                        lewVar.v().aa("events", lcaVar3);
                        lbdVar2 = lbdVar;
                        lbz lbzVar3 = new lbz(lewVar.t, str8, str2, str, lcdVar.d, 0L, j, bundle2);
                        aihfVarCreateBuilder = lin.a.createBuilder();
                        long j110 = lbzVar3.d;
                        aihfVarCreateBuilder.copyOnWrite();
                        lin linVar8 = (lin) aihfVarCreateBuilder.instance;
                        linVar8.b |= 2;
                        linVar8.e = j110;
                        String str9 = lbzVar3.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        lin linVar9 = (lin) aihfVarCreateBuilder.instance;
                        str9.getClass();
                        linVar9.b |= 1;
                        linVar9.d = str9;
                        long j111 = lbzVar3.f;
                        aihfVarCreateBuilder.copyOnWrite();
                        lin linVar10 = (lin) aihfVarCreateBuilder.instance;
                        linVar10.b |= 4;
                        linVar10.f = j111;
                        lccVar = lbzVar3.g;
                        lcbVar = new lcb(lccVar);
                        while (lcbVar.hasNext()) {
                            String next3 = lcbVar.next();
                            aihfVarCreateBuilder2 = lip.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            lip lipVar3 = (lip) aihfVarCreateBuilder2.instance;
                            next3.getClass();
                            lipVar3.b |= 1;
                            lipVar3.c = next3;
                            objC = lccVar.c(next3);
                            if (objC != null) {
                                lewVar.u().X(aihfVarCreateBuilder2, objC);
                                aihfVarCreateBuilder.bg(aihfVarCreateBuilder2);
                            }
                        }
                        aihfVar2 = aihfVar;
                        aihfVar2.bk(aihfVarCreateBuilder);
                        aihf aihfVarCreateBuilder12 = lis.a.createBuilder();
                        aihf aihfVarCreateBuilder13 = lio.a.createBuilder();
                        long j112 = lcaVar3.c;
                        aihfVarCreateBuilder13.copyOnWrite();
                        lio lioVar7 = (lio) aihfVarCreateBuilder13.instance;
                        lioVar7.b |= 2;
                        lioVar7.d = j112;
                        aihfVarCreateBuilder13.copyOnWrite();
                        lio lioVar8 = (lio) aihfVarCreateBuilder13.instance;
                        str.getClass();
                        lioVar8.b |= 1;
                        lioVar8.c = str;
                        aihfVarCreateBuilder12.copyOnWrite();
                        lisVar = (lis) aihfVarCreateBuilder12.instance;
                        lio lioVar9 = (lio) aihfVarCreateBuilder13.build();
                        lioVar9.getClass();
                        aiieVar = lisVar.b;
                        if (!aiieVar.c()) {
                            lisVar.b = aihn.mutableCopy(aiieVar);
                        }
                        lisVar.b.add(lioVar9);
                        aihfVar2.copyOnWrite();
                        lir lirVar2110 = (lir) aihfVar2.instance;
                        lis lisVar4 = (lis) aihfVarCreateBuilder12.build();
                        lisVar4.getClass();
                        lirVar2110.K = lisVar4;
                        lirVar2110.c |= 8;
                        aihfVar2.I(lewVar.l.h().a(lbdVar2.w(), Collections.EMPTY_LIST, DesugarCollections.unmodifiableList(((lir) aihfVar2.instance).f), Long.valueOf(((lin) aihfVarCreateBuilder.instance).e), Long.valueOf(((lin) aihfVarCreateBuilder.instance).e), false));
                        linVar = (lin) aihfVarCreateBuilder.instance;
                        if ((linVar.b & 2) != 0) {
                            long j113 = linVar.e;
                            aihfVar2.copyOnWrite();
                            lir lirVar2111 = (lir) aihfVar2.instance;
                            lirVar2111.b |= 4;
                            lirVar2111.h = j113;
                            long j114 = ((lin) aihfVarCreateBuilder.instance).e;
                            aihfVar2.copyOnWrite();
                            lir lirVar2112 = (lir) aihfVar2.instance;
                            lirVar2112.b |= 8;
                            lirVar2112.i = j114;
                        }
                        jK = lbdVar2.k();
                        if (jK != 0) {
                            aihfVar2.copyOnWrite();
                            lir lirVar2113 = (lir) aihfVar2.instance;
                            lirVar2113.b |= 32;
                            lirVar2113.k = jK;
                        } else {
                            jK = 0;
                        }
                        jM = lbdVar2.m();
                        if (jM != 0) {
                            aihfVar2.copyOnWrite();
                            lir lirVar2114 = (lir) aihfVar2.instance;
                            lirVar2114.b |= 16;
                            lirVar2114.j = jM;
                        } else if (jK != 0) {
                            aihfVar2.copyOnWrite();
                            lir lirVar2115 = (lir) aihfVar2.instance;
                            lirVar2115.b |= 16;
                            lirVar2115.j = jK;
                        }
                        strE = lbdVar2.E();
                        autm.c();
                        if (lewVar.G().F(str2, lcl.aM) && strE != null) {
                            aihfVar2.copyOnWrite();
                            lir lirVar2116 = (lir) aihfVar2.instance;
                            lirVar2116.c |= SemanticState.Multiline;
                            lirVar2116.P = strE;
                        }
                        ldrVar = lbdVar2.a;
                        ldrVar.r();
                        j2 = lbdVar2.c + 1;
                        if (j2 > 2147483647L) {
                            ldrVar.aT().f.b("Bundle index overflow. appId", lcz.a(lbdVar2.b));
                            j2 = 0;
                        }
                        lbdVar2.o = true;
                        lbdVar2.c = j2;
                        int iL3 = (int) lbdVar2.l();
                        aihfVar2.copyOnWrite();
                        lir lirVar2117 = (lir) aihfVar2.instance;
                        lirVar2117.b |= 1048576;
                        lirVar2117.z = iL3;
                        aihfVar2.copyOnWrite();
                        lir lirVar2118 = (lir) aihfVar2.instance;
                        lirVar2118.b |= 32768;
                        lirVar2118.u = 192008L;
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        aihfVar2.copyOnWrite();
                        lir lirVar2119 = (lir) aihfVar2.instance;
                        lirVar2119.b |= 2;
                        lirVar2119.g = jCurrentTimeMillis3;
                        aihfVar2.copyOnWrite();
                        lir lirVar34 = (lir) aihfVar2.instance;
                        lirVar34.b |= 8388608;
                        lirVar34.C = true;
                        lfvVar2.ak(lirVar34.r, aihfVar2);
                        aihfVarCreateBuilder3.bi(aihfVar2);
                        lbdVar2.ab(((lir) aihfVar2.instance).h);
                        lbdVar2.Z(((lir) aihfVar2.instance).i);
                        lewVar.v().an(lbdVar2, false);
                        lewVar.v().Y();
                        lewVar.v().S();
                        try {
                            return lewVar.u().N(((liq) aihfVarCreateBuilder3.build()).toByteArray());
                        } catch (IOException e2) {
                            lewVar.aT().c.c("Data loss. Failed to bundle and serialize. appId", lcz.a(str2), e2);
                            return null;
                        }
                    } catch (SecurityException e3) {
                        lewVar.aT().j.b("app instance id encryption failed", e3.getMessage());
                        bArr = new byte[0];
                    }
                }
            } else {
                lewVar.aT().j.b("Log and bundle disabled. package_name", str2);
                bArr = new byte[0];
            }
            byte[] bArr2 = bArr;
            lewVar.v().S();
            return bArr2;
        } catch (Throwable th) {
            lewVar.v().S();
            throw th;
        }
    }
}
