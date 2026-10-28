package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kjm extends kny {
    final /* synthetic */ kjn a;
    private final kic b;
    private final kiz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjm(kjn kjnVar, kic kicVar, knc kncVar, kiz kizVar) {
        super(kii.l, kncVar);
        this.a = kjnVar;
        this.b = kicVar;
        this.c = kizVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f7 A[Catch: all -> 0x02d4, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0201 A[Catch: all -> 0x02d4, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0206  */
    /* JADX WARN: Code duplicated, block: B:129:0x020c A[Catch: all -> 0x02d4, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0215 A[Catch: all -> 0x02c3, TryCatch #2 {, blocks: (B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267), top: B:361:0x0211, outer: #14, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0229 A[Catch: all -> 0x02c3, TryCatch #2 {, blocks: (B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267), top: B:361:0x0211, outer: #14, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x022f A[Catch: all -> 0x02c3, TryCatch #2 {, blocks: (B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267), top: B:361:0x0211, outer: #14, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x023a A[Catch: all -> 0x02c3, TryCatch #2 {, blocks: (B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267), top: B:361:0x0211, outer: #14, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0262 A[Catch: all -> 0x02c3, TryCatch #2 {, blocks: (B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267), top: B:361:0x0211, outer: #14, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0276 A[Catch: all -> 0x02d4, TRY_LEAVE, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x029a  */
    /* JADX WARN: Code duplicated, block: B:164:0x029e A[Catch: all -> 0x02d4, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a7 A[Catch: all -> 0x02d4, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x02b3 A[Catch: all -> 0x02d4, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02b8 A[Catch: all -> 0x02d4, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0384  */
    /* JADX WARN: Code duplicated, block: B:279:0x0470 A[Catch: all -> 0x0474, DONT_GENERATE, TryCatch #15 {, blocks: (B:267:0x0436, B:269:0x043a, B:271:0x044a, B:273:0x0456, B:275:0x0464, B:276:0x046b, B:278:0x046d, B:279:0x0470), top: B:380:0x0436 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0 A[PHI: r0
      0x00a0: PHI (r0v15 agev) = (r0v14 agev), (r0v14 agev), (r0v106 agev) binds: [B:27:0x0073, B:29:0x0077, B:31:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:361:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0152 A[PHI: r18
      0x0152: PHI (r18v1 agev) = (r18v3 agev), (r18v3 agev), (r18v4 agev), (r18v4 agev) binds: [B:360:0x0152, B:69:0x014e, B:61:0x0130, B:63:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x016d A[Catch: all -> 0x02d4, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x017b A[Catch: all -> 0x02d4, TRY_LEAVE, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x018e A[Catch: SecurityException -> 0x00da, all -> 0x02d4, TRY_LEAVE, TryCatch #7 {SecurityException -> 0x00da, blocks: (B:79:0x018a, B:81:0x018e, B:88:0x01a7), top: B:370:0x018a }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[Catch: all -> 0x01a8, TryCatch #6 {all -> 0x01a8, blocks: (B:82:0x018f, B:84:0x0193, B:85:0x01a4), top: B:368:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ac A[Catch: all -> 0x02d4, TRY_ENTER, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01b4 A[Catch: all -> 0x02d4, TryCatch #14 {, blocks: (B:24:0x006b, B:26:0x006f, B:28:0x0075, B:30:0x0079, B:32:0x0085, B:34:0x00a5, B:38:0x00ac, B:40:0x00b7, B:42:0x00c9, B:92:0x01ac, B:94:0x01b4, B:95:0x01b6, B:122:0x01f7, B:123:0x01f9, B:125:0x0201, B:129:0x020c, B:130:0x0210, B:150:0x0268, B:152:0x0276, B:154:0x027e, B:164:0x029e, B:167:0x02a7, B:161:0x028f, B:176:0x02c2, B:168:0x02ab, B:171:0x02b3, B:172:0x02b8, B:173:0x02bc, B:186:0x02d0, B:117:0x01f0, B:44:0x00de, B:46:0x00e6, B:76:0x016d, B:78:0x017b, B:79:0x018a, B:81:0x018e, B:88:0x01a7, B:47:0x00f3, B:48:0x00f5, B:74:0x015f, B:180:0x02c6, B:183:0x02c9, B:184:0x02cb, B:131:0x0211, B:133:0x0215, B:135:0x0229, B:137:0x0234, B:136:0x022f, B:138:0x0236, B:140:0x023a, B:142:0x023e, B:144:0x0242, B:147:0x025b, B:148:0x0262, B:149:0x0267, B:49:0x00f6, B:51:0x00fe, B:52:0x010a, B:54:0x010e, B:56:0x011a, B:60:0x012c, B:62:0x0132, B:66:0x013f, B:67:0x0143, B:68:0x014a, B:72:0x0153, B:73:0x015e, B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:379:0x006b, inners: #2, #4, #11 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01bb A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #11 {all -> 0x01f1, blocks: (B:96:0x01b7, B:98:0x01bb, B:100:0x01ca, B:109:0x01e3, B:114:0x01ed, B:108:0x01e0, B:111:0x01e7, B:112:0x01ea, B:99:0x01bf, B:107:0x01d5), top: B:376:0x01b7, outer: #14, inners: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r4v26, types: [android.app.PendingIntent, klo] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, java.util.Queue] */
    @Override // defpackage.kny
    protected final /* synthetic */ void b(kmp kmpVar) {
        Throwable th;
        List<aull> list;
        agev agevVar;
        String strF;
        agev agevVar2;
        boolean z;
        boolean zBooleanValue;
        ContentResolver contentResolver;
        Object obj;
        qjw qjwVar;
        boolean z2;
        final qjw qjwVar2;
        Object objA;
        Context context;
        qkb qkbVar;
        final qkb qkbVar2;
        Object obj2;
        Object obj3;
        qkb qkbVar3;
        Map map;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        agfr agfrVar;
        ArrayList<aull> arrayList;
        int i;
        kiw kiwVar;
        klq[] klqVarArrY;
        int size;
        boolean z3;
        mea meaVar;
        long jLongValue;
        long jT;
        kjo kjoVar = (kjo) kmpVar;
        try {
            kic kicVarC = this.b.c();
            if (kicVarC == null) {
                l(Status.a);
                return;
            }
            String str2 = kicVarC.h;
            int iA = kicVarC.a();
            if (str2 == null) {
                str2 = null;
            }
            kiv kivVar = kicVarC.a.c;
            if (str2 == null) {
                arrayList = new ArrayList();
                kivVar = kivVar;
                th = null;
            } else {
                kju kjuVar = (kju) kivVar;
                if (kjuVar.d == null) {
                    list = Collections.EMPTY_LIST;
                    kivVar = kivVar;
                    th = null;
                } else {
                    ConcurrentHashMap concurrentHashMap = kju.a;
                    qkm qkmVar = (qkm) concurrentHashMap.get(str2);
                    if (qkmVar == null) {
                        ayq ayqVar = kju.e;
                        aulm aulmVar = aulm.a;
                        qkl qklVar = qkm.a;
                        qkk qkkVar = new qkk(ayqVar, str2, aulmVar);
                        qkmVar = (qkm) concurrentHashMap.putIfAbsent(str2, qkkVar);
                        if (qkmVar == null) {
                            qkmVar = qkkVar;
                        }
                    }
                    boolean z4 = qkm.g.a;
                    int i2 = qkm.c.get();
                    if (qkmVar.e < i2) {
                        synchronized (qkmVar) {
                            if (qkmVar.e < i2) {
                                qkl qklVar2 = qkm.a;
                                agev agevVar3 = agdf.a;
                                if (qklVar2 == null || (agfrVar = qklVar2.b) == null) {
                                    th = null;
                                    agevVar = agevVar3;
                                    strF = null;
                                } else {
                                    agevVar3 = (agev) agfrVar.io();
                                    if (agevVar3.g()) {
                                        ijt ijtVar = (ijt) agevVar3.c();
                                        ayq ayqVar2 = qkmVar.h;
                                        th = null;
                                        strF = ijtVar.f((Uri) ayqVar2.b, (String) ayqVar2.c, qkmVar.d);
                                        agevVar = agevVar3;
                                    } else {
                                        th = null;
                                        agevVar = agevVar3;
                                        strF = null;
                                    }
                                }
                                boolean z5 = qkm.b;
                                ahno.P(qklVar2 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                                Object obj4 = qkmVar.h.b;
                                if (obj4 == null) {
                                    Context context2 = qklVar2.a;
                                    throw th;
                                }
                                Context context3 = qklVar2.a;
                                agev agevVar4 = qkd.a;
                                String authority = ((Uri) obj4).getAuthority();
                                if ("com.google.android.gms.phenotype".equals(authority)) {
                                    if (qkd.a.g()) {
                                        zBooleanValue = ((Boolean) qkd.a.c()).booleanValue();
                                    } else {
                                        synchronized (qkd.b) {
                                            try {
                                                if (qkd.a.g()) {
                                                    zBooleanValue = ((Boolean) qkd.a.c()).booleanValue();
                                                } else {
                                                    try {
                                                        if ("com.google.android.gms".equals(context3.getPackageName())) {
                                                            agevVar2 = agevVar;
                                                        } else {
                                                            agevVar2 = agevVar;
                                                            ProviderInfo providerInfoResolveContentProvider = context3.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                                                            if (providerInfoResolveContentProvider == null || !"com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                                                                z = false;
                                                            }
                                                            qkd.a = new agfa(Boolean.valueOf(z));
                                                            zBooleanValue = ((Boolean) qkd.a.c()).booleanValue();
                                                        }
                                                        if ((context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                    } catch (PackageManager.NameNotFoundException unused) {
                                                    }
                                                    qkd.a = new agfa(Boolean.valueOf(z));
                                                    zBooleanValue = ((Boolean) qkd.a.c()).booleanValue();
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            contentResolver = qklVar2.a.getContentResolver();
                                            obj = qkmVar.h.b;
                                            ConcurrentMap concurrentMap = qjw.a;
                                            if (obj != null) {
                                                qjwVar = (qjw) j$.util.concurrent.ConcurrentMap.EL.computeIfAbsent(qjw.a, obj, new wce(contentResolver, obj, 1));
                                                try {
                                                    z2 = qjwVar.f;
                                                    qjwVar2 = qjwVar;
                                                    if (z2) {
                                                        synchronized (qjwVar) {
                                                            try {
                                                                if (qjwVar.f) {
                                                                    qjv qjvVar = new qjv(qjwVar);
                                                                    qjwVar.c.registerContentObserver(qjwVar.d, false, qjvVar);
                                                                    qjwVar.e = qjvVar;
                                                                    qjwVar.f = false;
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                        }
                                                        qjwVar2 = qjwVar;
                                                    }
                                                } catch (SecurityException unused2) {
                                                    qjwVar2 = th;
                                                }
                                            }
                                        }
                                        if (qjwVar2 != 0) {
                                            String strC = qkmVar.c();
                                            map = qjwVar2.h;
                                            if (map == null) {
                                                synchronized (qjwVar2.g) {
                                                    try {
                                                        map = qjwVar2.h;
                                                        if (map == null) {
                                                            threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                            try {
                                                                try {
                                                                    map = (Map) qnl.r(new qjy() { // from class: qju
                                                                        @Override // defpackage.qjy
                                                                        public final Object a() {
                                                                            Map map2;
                                                                            Map map3;
                                                                            qjw qjwVar3 = qjwVar2;
                                                                            ContentResolver contentResolver2 = qjwVar3.c;
                                                                            Uri uri = qjwVar3.d;
                                                                            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver2.acquireUnstableContentProviderClient(uri);
                                                                            try {
                                                                                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                                                                    Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                                                                    return Collections.EMPTY_MAP;
                                                                                }
                                                                                try {
                                                                                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, qjw.b, null, null, null);
                                                                                    try {
                                                                                        if (cursorQuery == null) {
                                                                                            Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                                                            map2 = Collections.EMPTY_MAP;
                                                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                                            return map2;
                                                                                        }
                                                                                        int count = cursorQuery.getCount();
                                                                                        if (count == 0) {
                                                                                            map3 = Collections.EMPTY_MAP;
                                                                                        } else {
                                                                                            Map afvVar = count <= 256 ? new afv(count) : new HashMap(count, 1.0f);
                                                                                            while (cursorQuery.moveToNext()) {
                                                                                                afvVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                                                            }
                                                                                            if (cursorQuery.isAfterLast()) {
                                                                                                cursorQuery.close();
                                                                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                                                return afvVar;
                                                                                            }
                                                                                            Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                                                            map3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                        cursorQuery.close();
                                                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                                        return map3;
                                                                                    } catch (Throwable th4) {
                                                                                        if (cursorQuery == null) {
                                                                                            throw th4;
                                                                                        }
                                                                                        try {
                                                                                            cursorQuery.close();
                                                                                            throw th4;
                                                                                        } catch (Throwable th5) {
                                                                                            th4.addSuppressed(th5);
                                                                                            throw th4;
                                                                                        }
                                                                                    }
                                                                                } catch (RemoteException e) {
                                                                                    Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                                                                                    map2 = Collections.EMPTY_MAP;
                                                                                }
                                                                            } catch (Throwable th6) {
                                                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                                throw th6;
                                                                            }
                                                                        }
                                                                    });
                                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                                } catch (Throwable th4) {
                                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                                    throw th4;
                                                                }
                                                            } catch (SQLiteException | IllegalStateException | SecurityException e) {
                                                                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                                                map = Collections.EMPTY_MAP;
                                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                            }
                                                            qjwVar2.h = map;
                                                        } else {
                                                            kivVar = kivVar;
                                                        }
                                                    } catch (Throwable th5) {
                                                        throw th5;
                                                    }
                                                }
                                            } else {
                                                kivVar = kivVar;
                                            }
                                            if (map == null) {
                                                map = Collections.EMPTY_MAP;
                                            }
                                            str = (String) map.get(strC);
                                            if (str != null) {
                                                objA = qkmVar.a(str);
                                            }
                                            if (objA == null) {
                                                context = qklVar2.a;
                                                synchronized (qkb.class) {
                                                    if (qkb.a == null) {
                                                        if (api.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                                                            qkbVar3 = new qkb(context);
                                                        } else {
                                                            qkbVar3 = new qkb();
                                                        }
                                                        qkb.a = qkbVar3;
                                                    }
                                                    qkbVar = qkb.a;
                                                    if (qkbVar != null || qkbVar.d == null || qkbVar.b) {
                                                        qkbVar2 = qkb.a;
                                                        qkbVar2.getClass();
                                                    } else {
                                                        try {
                                                            context.getContentResolver().registerContentObserver(lsy.a, true, (ContentObserver) qkb.a.d);
                                                            qkb qkbVar4 = qkb.a;
                                                            qkbVar4.getClass();
                                                            qkbVar4.b = true;
                                                        } catch (SecurityException e2) {
                                                            Log.e("GservicesLoader", "Unable to register Gservices content observer", e2);
                                                        }
                                                        qkbVar2 = qkb.a;
                                                        qkbVar2.getClass();
                                                    }
                                                }
                                                final String strD = qkmVar.d((String) qkmVar.h.a);
                                                obj2 = qkbVar2.c;
                                                if (obj2 == null && mef.h((Context) obj2)) {
                                                    try {
                                                        obj3 = (String) qnl.r(new qjy() { // from class: qjz
                                                            @Override // defpackage.qjy
                                                            public final Object a() {
                                                                Object obj5 = qkbVar2.c;
                                                                obj5.getClass();
                                                                return lsx.a.a(((Context) obj5).getContentResolver(), strD, null);
                                                            }
                                                        });
                                                    } catch (IllegalStateException | NullPointerException | SecurityException e3) {
                                                        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(strD), e3);
                                                        obj3 = th;
                                                    }
                                                } else {
                                                    obj3 = th;
                                                }
                                                if (obj3 != null) {
                                                    objA = qkmVar.a(obj3);
                                                } else {
                                                    objA = th;
                                                }
                                                if (objA == null) {
                                                    objA = qkmVar.b();
                                                }
                                            }
                                            if (agevVar2.g()) {
                                                if (strF == null) {
                                                    objA = qkmVar.b();
                                                } else {
                                                    objA = qkmVar.a(strF);
                                                }
                                            }
                                            qkmVar.f = objA;
                                            qkmVar.e = i2;
                                        } else {
                                            kivVar = kivVar;
                                        }
                                        objA = th;
                                        if (objA == null) {
                                            context = qklVar2.a;
                                            synchronized (qkb.class) {
                                                if (qkb.a == null) {
                                                    if (api.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                                                        qkbVar3 = new qkb(context);
                                                    } else {
                                                        qkbVar3 = new qkb();
                                                    }
                                                    qkb.a = qkbVar3;
                                                }
                                                qkbVar = qkb.a;
                                                if (qkbVar != null) {
                                                    qkbVar2 = qkb.a;
                                                    qkbVar2.getClass();
                                                    final String strD2 = qkmVar.d((String) qkmVar.h.a);
                                                    obj2 = qkbVar2.c;
                                                    if (obj2 == null) {
                                                        obj3 = th;
                                                    } else {
                                                        obj3 = th;
                                                    }
                                                    if (obj3 != null) {
                                                        objA = qkmVar.a(obj3);
                                                    } else {
                                                        objA = th;
                                                    }
                                                    if (objA == null) {
                                                        objA = qkmVar.b();
                                                    }
                                                } else {
                                                    qkbVar2 = qkb.a;
                                                    qkbVar2.getClass();
                                                    final String strD3 = qkmVar.d((String) qkmVar.h.a);
                                                    obj2 = qkbVar2.c;
                                                    if (obj2 == null) {
                                                        obj3 = th;
                                                    } else {
                                                        obj3 = th;
                                                    }
                                                    if (obj3 != null) {
                                                        objA = qkmVar.a(obj3);
                                                    } else {
                                                        objA = th;
                                                    }
                                                    if (objA == null) {
                                                        objA = qkmVar.b();
                                                    }
                                                }
                                            }
                                        }
                                        if (agevVar2.g()) {
                                            if (strF == null) {
                                                objA = qkmVar.b();
                                            } else {
                                                objA = qkmVar.a(strF);
                                            }
                                        }
                                        qkmVar.f = objA;
                                        qkmVar.e = i2;
                                    }
                                    agevVar2 = agevVar;
                                    if (zBooleanValue) {
                                        contentResolver = qklVar2.a.getContentResolver();
                                        obj = qkmVar.h.b;
                                        ConcurrentMap concurrentMap2 = qjw.a;
                                        if (obj != null) {
                                            qjwVar = (qjw) j$.util.concurrent.ConcurrentMap.EL.computeIfAbsent(qjw.a, obj, new wce(contentResolver, obj, 1));
                                            z2 = qjwVar.f;
                                            qjwVar2 = qjwVar;
                                            if (z2) {
                                                synchronized (qjwVar) {
                                                    if (qjwVar.f) {
                                                        qjv qjvVar2 = new qjv(qjwVar);
                                                        qjwVar.c.registerContentObserver(qjwVar.d, false, qjvVar2);
                                                        qjwVar.e = qjvVar2;
                                                        qjwVar.f = false;
                                                    }
                                                    qjwVar2 = qjwVar;
                                                }
                                            }
                                        }
                                    }
                                    if (qjwVar2 != 0) {
                                        String strC2 = qkmVar.c();
                                        map = qjwVar2.h;
                                        if (map == null) {
                                            synchronized (qjwVar2.g) {
                                                map = qjwVar2.h;
                                                if (map == null) {
                                                    threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                    map = (Map) qnl.r(new qjy() { // from class: qju
                                                        @Override // defpackage.qjy
                                                        public final Object a() {
                                                            Map map2;
                                                            Map map3;
                                                            qjw qjwVar3 = qjwVar2;
                                                            ContentResolver contentResolver2 = qjwVar3.c;
                                                            Uri uri = qjwVar3.d;
                                                            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver2.acquireUnstableContentProviderClient(uri);
                                                            try {
                                                                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                                                    Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                                                    return Collections.EMPTY_MAP;
                                                                }
                                                                try {
                                                                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, qjw.b, null, null, null);
                                                                    try {
                                                                        if (cursorQuery == null) {
                                                                            Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                                            map2 = Collections.EMPTY_MAP;
                                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                            return map2;
                                                                        }
                                                                        int count = cursorQuery.getCount();
                                                                        if (count == 0) {
                                                                            map3 = Collections.EMPTY_MAP;
                                                                        } else {
                                                                            Map afvVar = count <= 256 ? new afv(count) : new HashMap(count, 1.0f);
                                                                            while (cursorQuery.moveToNext()) {
                                                                                afvVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                                            }
                                                                            if (cursorQuery.isAfterLast()) {
                                                                                cursorQuery.close();
                                                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                                return afvVar;
                                                                            }
                                                                            Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                                            map3 = Collections.EMPTY_MAP;
                                                                        }
                                                                        cursorQuery.close();
                                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                        return map3;
                                                                    } catch (Throwable th6) {
                                                                        if (cursorQuery == null) {
                                                                            throw th6;
                                                                        }
                                                                        try {
                                                                            cursorQuery.close();
                                                                            throw th6;
                                                                        } catch (Throwable th7) {
                                                                            th6.addSuppressed(th7);
                                                                            throw th6;
                                                                        }
                                                                    }
                                                                } catch (RemoteException e4) {
                                                                    Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e4);
                                                                    map2 = Collections.EMPTY_MAP;
                                                                }
                                                            } catch (Throwable th8) {
                                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                throw th8;
                                                            }
                                                        }
                                                    });
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                    qjwVar2.h = map;
                                                } else {
                                                    kivVar = kivVar;
                                                }
                                            }
                                        } else {
                                            kivVar = kivVar;
                                        }
                                        if (map == null) {
                                            map = Collections.EMPTY_MAP;
                                        }
                                        str = (String) map.get(strC2);
                                        if (str != null) {
                                            objA = qkmVar.a(str);
                                        }
                                        if (objA == null) {
                                            context = qklVar2.a;
                                            synchronized (qkb.class) {
                                                if (qkb.a == null) {
                                                    if (api.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                                                        qkbVar3 = new qkb(context);
                                                    } else {
                                                        qkbVar3 = new qkb();
                                                    }
                                                    qkb.a = qkbVar3;
                                                }
                                                qkbVar = qkb.a;
                                                if (qkbVar != null) {
                                                    qkbVar2 = qkb.a;
                                                    qkbVar2.getClass();
                                                    final String strD4 = qkmVar.d((String) qkmVar.h.a);
                                                    obj2 = qkbVar2.c;
                                                    if (obj2 == null) {
                                                        obj3 = th;
                                                    } else {
                                                        obj3 = th;
                                                    }
                                                    if (obj3 != null) {
                                                        objA = qkmVar.a(obj3);
                                                    } else {
                                                        objA = th;
                                                    }
                                                    if (objA == null) {
                                                        objA = qkmVar.b();
                                                    }
                                                } else {
                                                    qkbVar2 = qkb.a;
                                                    qkbVar2.getClass();
                                                    final String strD5 = qkmVar.d((String) qkmVar.h.a);
                                                    obj2 = qkbVar2.c;
                                                    if (obj2 == null) {
                                                        obj3 = th;
                                                    } else {
                                                        obj3 = th;
                                                    }
                                                    if (obj3 != null) {
                                                        objA = qkmVar.a(obj3);
                                                    } else {
                                                        objA = th;
                                                    }
                                                    if (objA == null) {
                                                        objA = qkmVar.b();
                                                    }
                                                }
                                            }
                                        }
                                        if (agevVar2.g()) {
                                            if (strF == null) {
                                                objA = qkmVar.b();
                                            } else {
                                                objA = qkmVar.a(strF);
                                            }
                                        }
                                        qkmVar.f = objA;
                                        qkmVar.e = i2;
                                    } else {
                                        kivVar = kivVar;
                                    }
                                    objA = th;
                                    if (objA == null) {
                                        context = qklVar2.a;
                                        synchronized (qkb.class) {
                                            if (qkb.a == null) {
                                                if (api.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                                                    qkbVar3 = new qkb(context);
                                                } else {
                                                    qkbVar3 = new qkb();
                                                }
                                                qkb.a = qkbVar3;
                                            }
                                            qkbVar = qkb.a;
                                            if (qkbVar != null) {
                                                qkbVar2 = qkb.a;
                                                qkbVar2.getClass();
                                                final String strD6 = qkmVar.d((String) qkmVar.h.a);
                                                obj2 = qkbVar2.c;
                                                if (obj2 == null) {
                                                    obj3 = th;
                                                } else {
                                                    obj3 = th;
                                                }
                                                if (obj3 != null) {
                                                    objA = qkmVar.a(obj3);
                                                } else {
                                                    objA = th;
                                                }
                                                if (objA == null) {
                                                    objA = qkmVar.b();
                                                }
                                            } else {
                                                qkbVar2 = qkb.a;
                                                qkbVar2.getClass();
                                                final String strD7 = qkmVar.d((String) qkmVar.h.a);
                                                obj2 = qkbVar2.c;
                                                if (obj2 == null) {
                                                    obj3 = th;
                                                } else {
                                                    obj3 = th;
                                                }
                                                if (obj3 != null) {
                                                    objA = qkmVar.a(obj3);
                                                } else {
                                                    objA = th;
                                                }
                                                if (objA == null) {
                                                    objA = qkmVar.b();
                                                }
                                            }
                                        }
                                    }
                                    if (agevVar2.g()) {
                                        if (strF == null) {
                                            objA = qkmVar.b();
                                        } else {
                                            objA = qkmVar.a(strF);
                                        }
                                    }
                                    qkmVar.f = objA;
                                    qkmVar.e = i2;
                                } else {
                                    Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
                                    agevVar2 = agevVar;
                                }
                                qjwVar2 = th;
                                if (qjwVar2 != 0) {
                                    String strC3 = qkmVar.c();
                                    map = qjwVar2.h;
                                    if (map == null) {
                                        synchronized (qjwVar2.g) {
                                            map = qjwVar2.h;
                                            if (map == null) {
                                                threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                map = (Map) qnl.r(new qjy() { // from class: qju
                                                    @Override // defpackage.qjy
                                                    public final Object a() {
                                                        Map map2;
                                                        Map map3;
                                                        qjw qjwVar3 = qjwVar2;
                                                        ContentResolver contentResolver2 = qjwVar3.c;
                                                        Uri uri = qjwVar3.d;
                                                        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver2.acquireUnstableContentProviderClient(uri);
                                                        try {
                                                            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                                                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                                                return Collections.EMPTY_MAP;
                                                            }
                                                            try {
                                                                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, qjw.b, null, null, null);
                                                                try {
                                                                    if (cursorQuery == null) {
                                                                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                                        map2 = Collections.EMPTY_MAP;
                                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                        return map2;
                                                                    }
                                                                    int count = cursorQuery.getCount();
                                                                    if (count == 0) {
                                                                        map3 = Collections.EMPTY_MAP;
                                                                    } else {
                                                                        Map afvVar = count <= 256 ? new afv(count) : new HashMap(count, 1.0f);
                                                                        while (cursorQuery.moveToNext()) {
                                                                            afvVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                                        }
                                                                        if (cursorQuery.isAfterLast()) {
                                                                            cursorQuery.close();
                                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                            return afvVar;
                                                                        }
                                                                        Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                                        map3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorQuery.close();
                                                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                    return map3;
                                                                } catch (Throwable th6) {
                                                                    if (cursorQuery == null) {
                                                                        throw th6;
                                                                    }
                                                                    try {
                                                                        cursorQuery.close();
                                                                        throw th6;
                                                                    } catch (Throwable th7) {
                                                                        th6.addSuppressed(th7);
                                                                        throw th6;
                                                                    }
                                                                }
                                                            } catch (RemoteException e4) {
                                                                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e4);
                                                                map2 = Collections.EMPTY_MAP;
                                                            }
                                                        } catch (Throwable th8) {
                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                            throw th8;
                                                        }
                                                    }
                                                });
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                qjwVar2.h = map;
                                            } else {
                                                kivVar = kivVar;
                                            }
                                        }
                                    } else {
                                        kivVar = kivVar;
                                    }
                                    if (map == null) {
                                        map = Collections.EMPTY_MAP;
                                    }
                                    str = (String) map.get(strC3);
                                    if (str != null) {
                                        objA = qkmVar.a(str);
                                    }
                                    if (objA == null) {
                                        context = qklVar2.a;
                                        synchronized (qkb.class) {
                                            if (qkb.a == null) {
                                                if (api.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                                                    qkbVar3 = new qkb(context);
                                                } else {
                                                    qkbVar3 = new qkb();
                                                }
                                                qkb.a = qkbVar3;
                                            }
                                            qkbVar = qkb.a;
                                            if (qkbVar != null) {
                                                qkbVar2 = qkb.a;
                                                qkbVar2.getClass();
                                                final String strD8 = qkmVar.d((String) qkmVar.h.a);
                                                obj2 = qkbVar2.c;
                                                if (obj2 == null) {
                                                    obj3 = th;
                                                } else {
                                                    obj3 = th;
                                                }
                                                if (obj3 != null) {
                                                    objA = qkmVar.a(obj3);
                                                } else {
                                                    objA = th;
                                                }
                                                if (objA == null) {
                                                    objA = qkmVar.b();
                                                }
                                            } else {
                                                qkbVar2 = qkb.a;
                                                qkbVar2.getClass();
                                                final String strD9 = qkmVar.d((String) qkmVar.h.a);
                                                obj2 = qkbVar2.c;
                                                if (obj2 == null) {
                                                    obj3 = th;
                                                } else {
                                                    obj3 = th;
                                                }
                                                if (obj3 != null) {
                                                    objA = qkmVar.a(obj3);
                                                } else {
                                                    objA = th;
                                                }
                                                if (objA == null) {
                                                    objA = qkmVar.b();
                                                }
                                            }
                                        }
                                    }
                                    if (agevVar2.g()) {
                                        if (strF == null) {
                                            objA = qkmVar.b();
                                        } else {
                                            objA = qkmVar.a(strF);
                                        }
                                    }
                                    qkmVar.f = objA;
                                    qkmVar.e = i2;
                                } else {
                                    kivVar = kivVar;
                                }
                                objA = th;
                                if (objA == null) {
                                    context = qklVar2.a;
                                    synchronized (qkb.class) {
                                        if (qkb.a == null) {
                                            if (api.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                                                qkbVar3 = new qkb(context);
                                            } else {
                                                qkbVar3 = new qkb();
                                            }
                                            qkb.a = qkbVar3;
                                        }
                                        qkbVar = qkb.a;
                                        if (qkbVar != null) {
                                            qkbVar2 = qkb.a;
                                            qkbVar2.getClass();
                                            final String strD10 = qkmVar.d((String) qkmVar.h.a);
                                            obj2 = qkbVar2.c;
                                            if (obj2 == null) {
                                                obj3 = th;
                                            } else {
                                                obj3 = th;
                                            }
                                            if (obj3 != null) {
                                                objA = qkmVar.a(obj3);
                                            } else {
                                                objA = th;
                                            }
                                            if (objA == null) {
                                                objA = qkmVar.b();
                                            }
                                        } else {
                                            qkbVar2 = qkb.a;
                                            qkbVar2.getClass();
                                            final String strD11 = qkmVar.d((String) qkmVar.h.a);
                                            obj2 = qkbVar2.c;
                                            if (obj2 == null) {
                                                obj3 = th;
                                            } else {
                                                obj3 = th;
                                            }
                                            if (obj3 != null) {
                                                objA = qkmVar.a(obj3);
                                            } else {
                                                objA = th;
                                            }
                                            if (objA == null) {
                                                objA = qkmVar.b();
                                            }
                                        }
                                    }
                                }
                                if (agevVar2.g()) {
                                    if (strF == null) {
                                        objA = qkmVar.b();
                                    } else {
                                        objA = qkmVar.a(strF);
                                    }
                                }
                                qkmVar.f = objA;
                                qkmVar.e = i2;
                            } else {
                                kivVar = kivVar;
                                th = null;
                            }
                        }
                    } else {
                        kivVar = kivVar;
                        th = null;
                    }
                    list = ((aulm) qkmVar.f).b;
                }
                ArrayList arrayList2 = new ArrayList();
                Context context4 = kjuVar.d;
                String packageName = context4 != null ? context4.getPackageName() : "";
                for (aull aullVar : list) {
                    if (aullVar.g.size() <= 0 || aullVar.g.contains(packageName)) {
                        if ((aullVar.b & 1) == 0 || (i = aullVar.c) == 0 || i == iA) {
                            arrayList2.add(aullVar);
                        }
                    }
                }
                arrayList = arrayList2;
            }
            for (aull aullVar2 : arrayList) {
                String str3 = aullVar2.d;
                Context context5 = ((kju) kivVar).d;
                if (mef.h(context5)) {
                    if (kju.c == null) {
                        if (context5 != null) {
                            if (kju.b == null) {
                                kju.b = Boolean.valueOf(kte.a.a(context5).e("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
                            }
                            if (kju.b.booleanValue()) {
                                kju.c = Long.valueOf(lsx.a.c(context5.getContentResolver(), 0L));
                            } else {
                                kju.c = 0L;
                            }
                        } else {
                            jLongValue = 0;
                        }
                    }
                    jLongValue = kju.c.longValue();
                } else {
                    jLongValue = 0;
                }
                if (str3 == null || str3.isEmpty()) {
                    byte[] bArrArray = ByteBuffer.allocate(8).putLong(jLongValue).array();
                    jT = kro.t(bArrArray, bArrArray.length);
                } else {
                    byte[] bytes = str3.getBytes(StandardCharsets.UTF_8);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
                    byteBufferAllocate.put(bytes);
                    byteBufferAllocate.putLong(jLongValue);
                    byte[] bArrArray2 = byteBufferAllocate.array();
                    jT = kro.t(bArrArray2, bArrArray2.length);
                }
                long j = aullVar2.e;
                long j2 = aullVar2.f;
                if (j >= 0 && j2 > 0) {
                    if ((jT >= 0 ? jT % j2 : (((Long.MAX_VALUE % j2) + 1) + ((jT & Long.MAX_VALUE) % j2)) % j2) >= j) {
                        l(Status.a);
                        return;
                    }
                }
            }
            kiz kizVar = this.c;
            if (!kizVar.b()) {
                l(new Status(0, "The event was not logged due to sampling.", null, null));
                kjs.b().e(kicVarC.h, 1006);
                return;
            }
            double d = kizVar.f;
            if (d != 0.0d) {
                kicVarC.h(d);
            }
            try {
                kiw kiwVarD = kicVarC.d();
                if ((kicVarC instanceof kih) && (meaVar = ((kih) kicVarC).o) != null) {
                    aulj auljVar = kiwVarD.o;
                    auljVar.getClass();
                    auljVar.f.G();
                    yz yzVar = mdt.a;
                    if (Looper.getMainLooper().equals(Looper.myLooper())) {
                        throw new NetworkOnMainThreadException();
                    }
                    mdr mdrVar = meaVar.a;
                    Context context6 = mdrVar.a;
                    yz yzVar2 = mdt.a;
                    if (!mdz.a) {
                        synchronized (mdz.b) {
                            if (!mdz.a) {
                                mdz.a = true;
                                qkh.c(context6);
                                qkm.f(context6);
                                if (!mdu.a(context6)) {
                                    if (!auqo.a.io().b() || kmm.a(context6).b(context6.getPackageName())) {
                                        mdz.a(mdrVar, yzVar2);
                                    } else {
                                        Log.w("CBVerifier", "Phenotype flags were not sycned because package was not Google Signed.");
                                    }
                                }
                            }
                        }
                    }
                    if (auqo.a.io().a()) {
                        if (mdu.a == null) {
                            synchronized (mdu.class) {
                                if (mdu.a == null) {
                                    mdu.a = new mdu();
                                }
                            }
                        }
                        mdu mduVar = mdu.a;
                    }
                    auqr.a.io();
                    auqo.a.io().c();
                    kiwVarD.i = new kjv(true);
                }
                kiwVar = kiwVarD;
            } catch (RuntimeException e4) {
                Log.e("ClearcutLoggerApiImpl", "Error building the LogEventParcelable.", e4);
                kiwVar = th;
            }
            if (kiwVar == 0) {
                ?? r4 = th;
                i(new Status(10, "MessageProducer", r4, r4));
                return;
            }
            if (auqh.a.io().e(kjoVar.p) && (klqVarArrY = kjoVar.y()) != null) {
                for (klq klqVar : klqVarArrY) {
                    klq klqVar2 = kiu.c;
                    if (Objects.equals(klqVar2.a, klqVar.a) && klqVar.a() >= klqVar2.a()) {
                        kkc kkcVar = kjn.a;
                        kjk kjkVar = new kjk(this, 1);
                        kjk kjkVar2 = new kjk(this, 0);
                        kjy kjyVar = new kjy();
                        kjyVar.c(false);
                        kjyVar.b(false);
                        kjyVar.a = kiwVar;
                        kjyVar.b = kjkVar;
                        kjyVar.c = kjkVar2;
                        kjz kjzVarA = kjyVar.a();
                        kjx kjxVar = kkcVar.a;
                        Context context7 = kjoVar.p;
                        long jC = auqh.a.io().c(context7);
                        synchronized (kjxVar.a) {
                            ?? r8 = kjxVar.c;
                            r8.add(kjzVarA);
                            size = r8.size() + kjxVar.d.size();
                            z3 = kjxVar.b;
                            kjxVar.b = true;
                        }
                        kiw kiwVar2 = kjzVarA.a;
                        String str4 = kiwVar2.a.f;
                        kjx.a(str4, 1025);
                        byte[] bArr = kiwVar2.b;
                        if (bArr == null) {
                            kjx.a(str4, 1038);
                        } else if (bArr.length > auqh.a.io().b(context7)) {
                            kjx.a(str4, 1039);
                        }
                        if (size >= jC) {
                            kjx.a(str4, 1040);
                        }
                        if (z3) {
                            return;
                        }
                        kkcVar.b(kjoVar, kiwVar.a.f);
                        return;
                    }
                }
            }
            try {
                if (auqk.a.io().b(this.a.v)) {
                    kiwVar.l = kjs.b().a();
                }
                kjl kjlVar = new kjl(this);
                kjr kjrVar = (kjr) kjoVar.C();
                Parcel parcelC = kjrVar.c();
                gdc.e(parcelC, kjlVar);
                gdc.c(parcelC, kiwVar);
                kjrVar.f(1, parcelC);
                this.a.e(kjs.b().a());
            } catch (RemoteException | RuntimeException e5) {
                Log.e("ClearcutLoggerApiImpl", "Failed to call logEvent", e5);
                kjs.b().d(1009, this.a.v);
                if (e5 instanceof TransactionTooLargeException) {
                    Log.e("ClearcutLoggerApiImpl", "Log event caused a TransactionTooLargeException", e5);
                    kjs.b().e(kiwVar.a.f, 31004);
                } else {
                    kjs.b().e(kiwVar.a.f, 1003);
                }
                throw e5;
            }
        } catch (RuntimeException e6) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e6);
            i(new Status(10, "EventModifier", null, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kny, defpackage.knz
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.l(obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kni a(Status status) {
        return status;
    }
}
