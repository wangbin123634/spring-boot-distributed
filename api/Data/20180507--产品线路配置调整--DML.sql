UPDATE ct_product  SET p_destination= "延生观" WHERE p_destination='203';
UPDATE ct_product  SET p_destination= "厦门" WHERE p_destination='204';
UPDATE ct_product  SET p_destination= "重阳宫" WHERE p_destination='205';
UPDATE ct_product  SET p_destination= "拉卜愣" WHERE p_destination='206';
UPDATE ct_product  SET p_destination= "三亚" WHERE p_destination='207';
UPDATE ct_product  SET p_destination= "海口" WHERE p_destination='208';
UPDATE ct_product  SET p_destination= "福州" WHERE p_destination='209';
UPDATE ct_product  SET p_destination= "西藏" WHERE p_destination='210';
UPDATE ct_product  SET p_destination= "昆明" WHERE p_destination='211';
UPDATE ct_product  SET p_destination= "丽江" WHERE p_destination='212';
UPDATE ct_product  SET p_destination= "腾冲" WHERE p_destination='213';
UPDATE ct_product  SET p_destination= "普吉" WHERE p_destination='214';
UPDATE ct_product  SET p_destination= "雪乡" WHERE p_destination='215';
UPDATE ct_product  SET p_destination= "天津" WHERE p_destination='216';
UPDATE ct_product  SET p_destination= "成都" WHERE p_destination='217';
UPDATE ct_product  SET p_destination= "自定义" WHERE p_destination='218';
UPDATE ct_schedule_setting set departure_status = -1 WHERE departure_status = 0;