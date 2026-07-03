此專案是我在FRC中所負責的底盤與機構控制程式。
個人負責:負責兩種不同底盤驅動邏輯撰寫並分析各自利弊、測試與校正馬達輸出上限（約70% 速度限制以防暴衝）以及氣壓機構的按鈕觸發邏輯
核心技術與硬體架構 (Technical Highlights & Hardware):分為兩種型式

白輪型式(雙搖桿坦克模式):
1.底盤控制 (Drivetrain Control)
  a.軟硬體架構： 採用 DifferentialDrive（差速驅動/坦克模式）演算法。透過 MotorControllerGroup 將四顆經由 PWM 訊號控制的 Spark 馬達控制器，分組打包為左（LF, LR）、右（RF, RR）兩側獨立動力鏈。
  b.控制邏輯： 於手動控制模式（Teleoperated）下，利用雙搖桿輸入（Axis 1 與 Axis 5）各自映射左、右側馬達。
2.氣壓機構： 使用 DoubleSolenoid 搭配 CTRE PCM 控制氣壓閥，實現機械結構（如夾爪/升降）的精準作動。


麥克納姆輪型式:
1.底盤控制： 採用 MecanumDrive 演算法，透過 driveCartesian 實現三軸（X, Y, Z軸自轉）全向橫移控制。
2.動力系統： 驅動 4 顆 NEO 無刷馬達（透過 CANSparkMax 控制器與 CAN 總線通訊）。

