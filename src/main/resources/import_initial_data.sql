INSERT INTO USER_PROFILE(type) VALUES ('ADMIN');
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email) VALUES ('test','pwd123', 'test','test','test@test.com');
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id) SELECT user.id, profile.id FROM app_user user, user_profile profile where user.sso_id='test' and profile.type='ADMIN';
INSERT INTO APP_USER_TASK(TASK_IS_DONE, TASK_NAME, USER_ID, TASK_LAST_UPDATE ) VALUES ('false','test', SELECT user.id FROM app_user user where user.sso_id='test', '2018-04-12 19:27:19.325');